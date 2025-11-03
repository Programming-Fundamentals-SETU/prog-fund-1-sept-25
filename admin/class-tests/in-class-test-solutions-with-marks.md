# Programming Fundamentals 1 – In-Class Test (Solutions with Marks)

**Time:** 1 Hour  
**Date:** Monday, November 4th, 2025  

---

## Section A – Multiple Choice (40 Marks)
Each question = 2 marks.


| Q | Question Summary | Correct Answer |
|---|------------------|----------------|
| A.1 | `balance = balance + amount;` | **A** – Adds amount to current value |
| A.2 | Constructor rule | **A** – Name must match class name |
| A.3 | Best variable name | **A** – `ticketPrice` |
| A.4 | Constructor parameters | **A** – Initialize fields |
| A.5 | Boolean literals | **A** – `true` and `false` |
| A.6 | Equality test for ints | **B** – `a == b` |
| A.7 | `(mark >= 0) && (mark <=100)` | **A** – Between 0 and 100 inclusive |
| A.8 | `(mark < 0) || (mark > 100)` | **A** – Invalid mark (outside 0–100) |
| A.9 | `boolean isFriday = false; !isFriday` | **A** – `true` |
| A.10 | `if (canVote) { ... }` | **A** – Prints “You can vote!” when `age >= 18` |
| A.11 | `3 + 6 * 5 - 2` | **A** – `31` (since 6×5 first → 30 +3 −2) |
| A.12 | `if (x = 5)` | **A** – Uses `=` instead of `==` |
| A.13 | Teenager or senior | **A** – `(age >= 13 && age <= 19 || age >= 65)` |
| A.14 | `y *= 3;` | **B** – Multiplies y by 3 |
| A.15 | `int a=7,b=2; a/b` | **A** – 3 |
| A.16 | `int a=17,b=5; a % b` | **A** – 2 |
| A.17 | `int x=4; x-=6; x+=3;` | **C** – -2 +3 → **1** (final value) |
| A.18 | Declare array of 10 ints | **B** – `int numbers[] = new int[10];` |
| A.19 | `numbers.length` | **B** – Total capacity of array |
| A.20 | Array of Strings | **D** – Both B and C valid |

---

## Section B – Long Questions (60 Marks)

### Question B.1 – Classes and Objects  *(15 Marks total)*

#### B.1.1 Constructor  *(6 Marks)*
```java
public class TicketMachine {
    private int price;
    private int balance;
    private int total;

    public TicketMachine(int ticketPrice) {
        price = ticketPrice;
        balance = 0;
        total = 0;
    }
}
```

#### B.1.2 Getter for total  *(4 Marks)*
```java
public int getTotal() {
    return total;
}
```

#### B.1.3 Setter for price  *(5 Marks)*
```java
public void setPrice(int newPrice) {
    price = newPrice;
}
```

---

### Question B.2 – Arrays  *(15 Marks total)*

#### B.2.1 Declare array  *(2 Marks)*
```java
double[] wages = new double[20];
```

#### B.2.2 Use Scanner for input  *(3 Marks)*
```java
for (int i = 0; i < wages.length; i++) {
    wages[i] = input.nextDouble();
}
```

#### B.2.3 Calculate and print average  *(3 Marks)*
```java
double sum = 0;
for (double w : wages) sum += w;
double average = sum / wages.length;
System.out.println("Average wage = " + average);
```

#### B.2.4 Print wages over 1000  *(3 Marks)*
```java
for (double w : wages)
    if (w > 1000) System.out.println(w);
```

#### B.2.5 15% reduction > 1000  *(4 Marks)*
```java
for (int i = 0; i < wages.length; i++) {
    if (wages[i] > 1000)
        wages[i] *= 0.85;
    System.out.println(wages[i]);
}
```

---

### Question B.3 – Selection  *(15 Marks total)*

#### B.3.1 Print grade method  *(10 Marks)*
```java
public void printGrade(int mark) {
    if (mark >= 70)
        System.out.println("Distinction");
    else if (mark >= 60)
        System.out.println("Merit");
    else if (mark >= 40)
        System.out.println("Pass");
    else
        System.out.println("Fail");
}
```

#### B.3.2 Validate mark range  *(5 Marks)*
```java
public void validateMark(int mark) {
    if (mark >= 0 && mark <= 100)
        System.out.println("The mark is valid");
    else
        System.out.println("The mark is invalid");
}
```

---

### Question B.4 – Loops  *(15 Marks total)*

#### B.4.1 20 → 10  *(3 Marks)*
```java
for (int i = 20; i >= 10; i--)
    System.out.println(i);
```

#### B.4.2 2 → 17 steps of 3  *(3 Marks)*
```java
for (int i = 2; i <= 17; i += 3)
    System.out.println(i);
```

#### B.4.3 Trace loop output  *(4 Marks)*
```java
int i = 20;
while (i <= 27) {
    System.out.println("Value of i: " + i);
    i = i + 3;
}
System.out.println("Last value of i: " + i);
```
**Output**
```
Value of i: 20
Value of i: 23
Value of i: 26
Last value of i: 29
```

#### B.4.4 Nested loops  *(5 Marks)*
```java
for (int i = 1; i < 3; i++)
    for (int j = 0; j < 2; j++)
        System.out.println("i = " + i + ", j = " + j);
```
**Output**
```
i = 1, j = 0
i = 1, j = 1
i = 2, j = 0
i = 2, j = 1
```

---

**End of Paper**
