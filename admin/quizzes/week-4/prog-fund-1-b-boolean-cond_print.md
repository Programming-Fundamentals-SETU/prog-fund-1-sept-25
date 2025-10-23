# Printable Quiz

## 1. B1: Boolean literals

Which are valid Java boolean literals?

- (A) true and false
- (B) "true" and "false"
- (C) 1 and 0
- (D) Yes and No


## 2. B2: Relational operators

Which expression tests equality of primitive ints correctly?

int a = 5, b = 5;

- (A) a = b
- (B) a == b
- (C) a != b
- (D) a equals b


## 3. B3: AND example

For input mark, when is this condition true?

(mark >= 0) && (mark

- (A) When mark is between 0 and 100 inclusive
- (B) Only when mark is strictly between 0 and 100
- (C) When mark is negative
- (D) Always


## 4. B4: OR example

When is this condition true?

(mark  100)

- (A) When mark is invalid (outside 0..100)
- (B) When mark is 0..100 inclusive
- (C) Never
- (D) Always


## 5. B5: NOT example

Given boolean isFriday = false; what is:

!isFriday

- (A) true
- (B) false
- (C) 0
- (D) null


## 6. B6: Boolean variable in if

What prints?

boolean canVote = (age >= 18);
if (canVote) {
    System.out.println("You can vote!");
}

- (A) "You can vote!" when age >= 18
- (B) It never prints
- (C) It prints only when age == 18
- (D) Compilation error


## 7. B7: Short-circuit AND

Which statement about && is true?

- (A) Right-hand side is not evaluated if left-hand side is false
- (B) Both sides always evaluate
- (C) RHS is skipped when LHS is true
- (D) It performs bitwise AND on booleans


## 8. B8: Short-circuit OR

Which statement about || is true?

- (A) RHS is not evaluated if LHS is true
- (B) RHS is not evaluated if LHS is false
- (C) Both sides always evaluate
- (D) It’s the same as | on booleans


## 9. B9: Equality vs assignment trap

What is wrong with this code?

if (x = 5) {{
    System.out.println("Five");
}}

- (A) Uses = instead of ==
- (B) Missing semicolon after if
- (C) Should use === in Java
- (D) Nothing is wrong


## 10. B10: Combining conditions

Which condition matches “age is a teenager (13–19 inclusive) or a senior (65+)”?

- (A) (age >= 13 && age = 65)
- (B) (age > 13 && age  65)
- (C) age >= 13 || age >= 65
- (D) age = 65


---

## Answer Key

1. A
2. B
3. A
4. A
5. A
6. A
7. A
8. A
9. A
10. A
