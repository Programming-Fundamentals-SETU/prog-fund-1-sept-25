from __future__ import annotations
import argparse
import html
import os
import re
import sys
import xml.etree.ElementTree as ET
from typing import List, Dict, Any

TAG_RE = re.compile(r"<[^>]+>")

def strip_html(s: str) -> str:
    if s is None:
        return ""
    s = html.unescape(s)
    s = re.sub(r"<\s*br\s*/?>", "\n", s, flags=re.I)
    s = re.sub(r"</\s*p\s*>", "\n\n", s, flags=re.I)
    s = re.sub(r"<\s*p\s*>", "", s, flags=re.I)
    s = TAG_RE.sub("", s)
    s = re.sub(r"\n{3,}", "\n\n", s).strip()
    return s

def get_text(elem: ET.Element | None, default: str = "") -> str:
    if elem is None:
        return default
    t = elem.find("text")
    if t is None or t.text is None:
        return default
    return t.text

def clean_text(text: str) -> str:
    return strip_html(text).strip()

LETTER_MAP = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

def parse_moodle_xml(xml_path: str) -> List[Dict[str, Any]]:
    tree = ET.parse(xml_path)
    root = tree.getroot()
    if root.tag != "quiz":
        raise ValueError("This does not look like a Moodle XML quiz export (root element is not <quiz>).")
    questions: List[Dict[str, Any]] = []
    for q in root.findall("question"):
        qtype = q.get("type", "unknown")
        if qtype == "category":
            continue
        name = clean_text(get_text(q.find("name")))
        qtext = clean_text(get_text(q.find("questiontext")))
        generalfeedback = clean_text(get_text(q.find("generalfeedback")))
        item: Dict[str, Any] = {
            "type": qtype,
            "name": name or "(untitled)",
            "text": qtext,
            "generalfeedback": generalfeedback,
            "answers": [],
            "subquestions": [],
        }
        if qtype in ("multichoice", "truefalse", "shortanswer", "numerical", "matching"):
            if qtype in ("multichoice", "truefalse", "shortanswer", "numerical"):
                for ans in q.findall("answer"):
                    frac = ans.get("fraction", "0")
                    try:
                        is_correct = float(frac) > 0.0
                    except Exception:
                        is_correct = False
                    ans_text = clean_text(get_text(ans))
                    fb = clean_text(get_text(ans.find("feedback")))
                    item["answers"].append({"text": ans_text, "correct": is_correct, "feedback": fb})
            if qtype == "matching":
                for subq in q.findall("subquestion"):
                    subq_text = clean_text(get_text(subq.find("text")))
                    answer_text = clean_text(get_text(subq.find("answer")))
                    item["subquestions"].append({"text": subq_text, "answer": answer_text})
        else:
            item["note"] = f"(Question type '{qtype}' not fully supported for print; rendering question text only.)"
        questions.append(item)
    return questions

def render_markdown(questions: List[Dict[str, Any]], include_answer_key: bool = True) -> str:
    lines: List[str] = []
    lines.append("# Printable Quiz\n")
    answer_key_lines: List[str] = []
    for idx, q in enumerate(questions, start=1):
        title = q["name"] if q["name"] else f"Question {idx}"
        qtype = q["type"]
        lines.append(f"## {idx}. {title}")
        if q.get("note"):
            lines.append(f"*{q['note']}*")
        if q["text"]:
            lines.append("")
            lines.append(q["text"])
            lines.append("")
        if qtype in ("multichoice", "truefalse"):
            for i, ans in enumerate(q["answers"]):
                letter = LETTER_MAP[i % len(LETTER_MAP)]
                lines.append(f"- ({letter}) {ans['text']}")
            lines.append("")
            correct_letters = [LETTER_MAP[i] for i, a in enumerate(q["answers"]) if a["correct"]]
            if include_answer_key:
                answer_key_lines.append(f"{idx}. {', '.join(correct_letters) if correct_letters else '(none)'}")
        elif qtype == "shortanswer":
            lines.append("_Answer:_ ________________________________")
            if include_answer_key:
                corrects = [a["text"] for a in q["answers"] if a["correct"]]
                if corrects:
                    answer_key_lines.append(f"{idx}. Accept any of: {', '.join(corrects)}")
        elif qtype == "numerical":
            lines.append("_Answer (number): _______________________")
            if include_answer_key:
                corrects = [a["text"] for a in q["answers"] if a["correct"]]
                if corrects:
                    answer_key_lines.append(f"{idx}. {', '.join(corrects)}")
        elif qtype == "matching":
            lines.append("**Match the following:**")
            for i, sub in enumerate(q["subquestions"], start=1):
                lines.append(f"{i}. {sub['text']}  →  ________")
            if include_answer_key and q["subquestions"]:
                key = '; '.join([f"{i}. {sub['answer']}" for i, sub in enumerate(q['subquestions'], start=1)])
                answer_key_lines.append(f"{idx}. {key}")
        else:
            lines.append("_[Printed text only — options not supported in this exporter]_")
        lines.append("")
    if include_answer_key and answer_key_lines:
        lines.append("---\n")
        lines.append("## Answer Key\n")
        lines.extend([f"{line}" for line in answer_key_lines])
        lines.append("")
    return "\n".join(lines).strip() + "\n"

def render_html(questions: List[Dict[str, Any]], include_answer_key: bool = True) -> str:
    css = """
    <style>
      body { font-family: system-ui, -apple-system, Segoe UI, Roboto, Arial, sans-serif; line-height: 1.4; }
      h1, h2 { page-break-after: avoid; }
      .question { margin: 1em 0 1.5em; }
      .choices { margin-left: 1em; }
      .choices div { margin: 0.15em 0; }
      .key { page-break-before: always; }
      .note { color: #555; font-style: italic; }
      @media print { a { color: black; text-decoration: none; } }
    </style>
    """
    html_parts = [f"<!doctype html><html><head><meta charset='utf-8'><title>Printable Quiz</title>{css}</head><body>"]
    html_parts.append("<h1>Printable Quiz</h1>")
    key_entries: List[str] = []
    for idx, q in enumerate(questions, start=1):
        title = html.escape(q['name'] or f'Question {idx}')
        qtext = html.escape(q['text']).replace('\\n', '<br>')
        note = f"<div class='note'>{html.escape(q['note'])}</div>" if q.get('note') else ""
        html_parts.append(f"<div class='question'><h2>{idx}. {title}</h2>{note}<div>{qtext}</div>")
        if q["type"] in ("multichoice", "truefalse"):
            html_parts.append("<div class='choices'>")
            for i, ans in enumerate(q["answers"]):
                letter = LETTER_MAP[i % len(LETTER_MAP)]
                html_parts.append(f"<div>({letter}) {html.escape(ans['text'])}</div>")
            html_parts.append("</div>")
            correct_letters = [LETTER_MAP[i] for i, a in enumerate(q["answers"]) if a["correct"]]
            if include_answer_key:
                key_entries.append(f"{idx}. {', '.join(correct_letters) if correct_letters else '(none)'}")
        elif q["type"] == "shortanswer":
            html_parts.append("<div>Answer: ________________________________</div>")
            if include_answer_key:
                corrects = [a["text"] for a in q["answers"] if a["correct"]]
                if corrects:
                    key_entries.append(f"{idx}. Accept any of: {', '.join(html.escape(c) for c in corrects)}")
        elif q["type"] == "numerical":
            html_parts.append("<div>Answer (number): _______________________</div>")
            if include_answer_key:
                corrects = [a["text"] for a in q["answers"] if a["correct"]]
                if corrects:
                    key_entries.append(f"{idx}. {', '.join(html.escape(c) for c in corrects)}")
        elif q["type"] == "matching":
            html_parts.append("<div><strong>Match the following:</strong></div><ol>")
            for sub in q["subquestions"]:
                html_parts.append(f"<li>{html.escape(sub['text'])} &nbsp;→&nbsp; ________</li>")
            html_parts.append("</ol>")
            if include_answer_key and q["subquestions"]:
                key = '; '.join([f"{i}. {html.escape(sub['answer'])}" for i, sub in enumerate(q['subquestions'], start=1)])
                key_entries.append(f"{idx}. {key}")
        else:
            html_parts.append("<div><em>[Printed text only — options not supported in this exporter]</em></div>")
        html_parts.append("</div>")
    if include_answer_key and key_entries:
        html_parts.append("<div class='key'><h2>Answer Key</h2><ol>")
        for k in key_entries:
            html_parts.append(f"<li>{k}</li>")
        html_parts.append("</ol></div>")
    html_parts.append("</body></html>")
    return "".join(html_parts)

def main():
    parser = argparse.ArgumentParser(description="Convert Moodle XML quiz to printable Markdown or HTML.")
    parser.add_argument("input", help="Path to Moodle XML file (exported from the Question bank).")
    parser.add_argument("-o", "--output", help="Output file path (.md or .html). If omitted, writes both next to input.")
    parser.add_argument("--no-key", action="store_true", help="Do NOT include the answer key.")
    args = parser.parse_args()

    if not os.path.exists(args.input):
        print(f"Input not found: {args.input}", file=sys.stderr)
        sys.exit(1)

    questions = parse_moodle_xml(args.input)
    include_key = not args.no_key

    if args.output:
        ext = os.path.splitext(args.output)[1].lower()
        if ext in (".md", ".markdown"):
            out = render_markdown(questions, include_key)
            with open(args.output, "w", encoding="utf-8") as f:
                f.write(out)
            print(f"Wrote Markdown: {args.output}")
        elif ext in (".html", ".htm"):
            out = render_html(questions, include_key)
            with open(args.output, "w", encoding="utf-8") as f:
                f.write(out)
            print(f"Wrote HTML: {args.output}")
        else:
            print("Unknown extension. Use .md or .html (or omit --output to write both).", file=sys.stderr)
            sys.exit(2)
    else:
        base, _ = os.path.splitext(args.input)
        md_path = base + "_print.md"
        html_path = base + "_print.html"
        with open(md_path, "w", encoding="utf-8") as f:
            f.write(render_markdown(questions, include_key))
        with open(html_path, "w", encoding="utf-8") as f:
            f.write(render_html(questions, include_key))
        print(f"Wrote Markdown: {md_path}")
        print(f"Wrote HTML: {html_path}")

if __name__ == "__main__":
    main()
