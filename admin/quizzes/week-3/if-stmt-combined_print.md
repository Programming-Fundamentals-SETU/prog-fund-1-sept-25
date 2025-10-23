# Printable Quiz

## 1. C1: Basic if

What happens here if amount = -10?

if (amount > 0) {
    balance = balance + amount;
}

- (A) balance increases by -10
- (B) Nothing happens
- (C) Compilation error
- (D) balance decreases by 10


## 2. C2: If-else form

Complete behaviour of this code for positive vs non-positive values?

if (amount > 0) {
    balance = balance + amount;
} else {
    System.out.printf("Use a positive amount: %d%n", amount);
}

- (A) Positive adds to balance; otherwise prints a message
- (B) Always adds to balance
- (C) Always prints the message
- (D) Throws an exception for negative values


## 3. C3: Else-if chain

What prints for age = 15?

if (age

- (A) Child
- (B) Teenager
- (C) Adult
- (D) Nothing


## 4. C4: First true branch wins

How many branches execute in an if/else-if/else chain?

- (A) All branches that are true
- (B) Exactly one branch
- (C) Zero or two branches
- (D) All branches always


## 5. C5: Braces optionality

Which two snippets are equivalent?

// A
if (price

- (A) A and B are equivalent when the block has one statement
- (B) A and B are never equivalent
- (C) B is invalid Java
- (D) A executes twice


## 6. C6: Stray semicolon

What is wrong with the following?

if (price)

- (A) The semicolon ends the if; block always runs
- (B) Missing braces
- (C) Needs else
- (D) Correct as-is


## 7. C7: Ticket machine (simple)

What purpose does the condition serve?
~~~java
public void insertMoney(int amount) {
    if (amount > 0) {
        balance = balance + amount;
    }
}
~~~

- (A) Avoids adding non-positive amounts
- (B) Forces balance to 0 for negatives
- (C) Always adds amount
- (D) Throws exception for negatives


## 8. C8: Ticket machine (tiers)

What is the outcome for amount = 60?

public void specialOffer(int amount) {
    if (amount > 100) {
        balance = balance + 50;
    } else if (amount > 50) {
        balance = balance + 25;
    } else {
        amount = amount + 5;
    }
}

- (A) Adds 50 to balance
- (B) Adds 25 to balance
- (C) Adds 5 to amount
- (D) Does nothing


## 9. C9: Condition definition

Which best defines a boolean condition used by an if statement?

- (A) An expression that evaluates to true or false
- (B) A statement that prints output
- (C) A block of multiple statements
- (D) A method that returns an int


## 10. C10: Relational operator reminder

Which statement is correct about = vs ==?

- (A) = assigns; == tests equality for primitives
- (B) = tests equality; == assigns
- (C) Both test equality
- (D) Java uses === for equality


## 11. Q1: If statement—basic behaviour

In Java, what happens with the statements inside the braces of an if statement?

if (condition) {
    // statements
}

- (A) They execute only if the boolean condition evaluates to
- (B) They always execute once, regardless of the condition.
- (C) They execute repeatedly until the condition becomes false.
- (D) They execute only after the


## 12. Q7: Relational operators list

Which list contains only Java relational operators?

- (A) 
- (B) 
- (C) 
- (D) 


## 13. Q8: Else-if syntax

Which is the correct syntax for an else if clause in Java?

- (A) 
- (B) 
- (C) 
- (D) 


## 14. Q10: After-the-if code

Given:

// do some work
if (flag) {
    process();
}
// more work here
What can you say about the “more work here” section?

- (A) It will execute whether
- (B) It executes only when
- (C) It executes only when
- (D) It never executes because


---

## Answer Key

1. B
2. A
3. B
4. B
5. A
6. A
7. A
8. B
9. A
10. A
11. A
12. A
13. A
14. A
