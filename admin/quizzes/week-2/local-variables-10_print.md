# Printable Quiz

## 1. Variables recap: kinds

Which list correctly names the three kinds of variables discussed in class design?

- (A) Fields, parameters, and local variables
- (B) Fields, arrays, and constants
- (C) Parameters, methods, and classes
- (D) Locals, packages, and modules


## 2. Fields: scope and lifetime

What are the scope and lifetime of a field?

- (A) Scope: the whole class; Lifetime: the lifetime of the object
- (B) Scope: the declaring method; Lifetime: a single call
- (C) Scope: package; Lifetime: until program exit
- (D) Scope: a single block; Lifetime: one iteration


## 3. Parameters: role

What is the primary role of a parameter in a method or constructor?

- (A) To receive values from outside so the method can do its work
- (B) To persist data for the object across calls
- (C) To control visibility of fields
- (D) To print formatted output


## 4. Return statement behaviour

Why does this method fail to clear the balance?
public int refundBalance() {
    // Return the amount left.
    return balance;
    // Clear the balance.
    balance = 0;
}

- (A) The return ends the method, so the assignment to zero never runs
- (B) Assignments are illegal after a comment
- (C) The method needs two return statements
- (D) Only void methods may assign to fields


## 5. Local variable purpose

What is a typical use of a local variable inside a method?

- (A) Temporary storage needed during the method’s execution
- (B) Long-term storage across many method calls
- (C) Receiving input from outside the method
- (D) Controlling public/private visibility


## 6. Local variable example

In the revised refundBalance, why do we introduce amountToRefund?
public int refundBalance() {
    int amountToRefund;
    amountToRefund = balance;
    balance = 0;
    return amountToRefund;
}

- (A) To keep the amount while we reset the field, then return it
- (B) Because fields cannot be read in non-void methods
- (C) Because parameters cannot be declared in methods
- (D) To avoid using return statements


## 7. Scope of a local

What is the scope of a local variable declared inside a method block?

- (A) The block in which it is declared
- (B) The entire class
- (C) The whole package
- (D) Across all methods of the class


## 8. Lifetime of a local

When does a local variable exist?

- (A) Only while the containing block is executing
- (B) For the lifetime of the object
- (C) Until program termination
- (D) Across all future calls to the method


## 9. Scope vs lifetime

Which statement best distinguishes scope from lifetime?

- (A) Scope: where the name is visible in the source; Lifetime: how long the variable exists at runtime
- (B) Scope is runtime; lifetime is compile-time
- (C) They are synonyms
- (D) Scope applies only to classes; lifetime only to methods


## 10. No visibility modifier for locals

Why do local variables not use visibility modifiers like public or private?

- (A) Because their visibility is already limited to the declaring block
- (B) Because Java doesn’t allow modifiers anywhere
- (C) Because locals are always public by default
- (D) Because they are stored in a different file


---

## Answer Key

1. A
2. A
3. A
4. A
5. A
6. A
7. A
8. A
9. A
10. A
