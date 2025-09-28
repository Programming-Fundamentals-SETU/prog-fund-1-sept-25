---
icon:
  type: fluent-mdl2:handwriting
  color: orange
---
# Programming Fundamentals - Topic 03 Tutorial

# Tutorial Questions - Variables, Data Types & Operators

## Concept Check

1.  What is a variable in Java, and why do we need to specify its data
    type?
2.  Give two examples of valid variable names and two invalid ones.
    Explain why.

## Keywords

3.  What is a *keyword* (reserved word) in Java?
4.  Why can't you name a variable `class`?

## Tokens

5.  Break the line below into its tokens and identify their roles:

``` java
double price = 19.99;
```

## Primitive Data Types

6.  What is the difference between `int` and `double`?
7.  When would you choose a `boolean` instead of an `int`?

## Errors

8.  Why is `Int x = 5;` invalid?
9.  What happens if you try `int x = 5.5;`?

## Operators

10. What is the difference between `/` when used with integers
    vs. doubles?
11. Predict the output of:

``` java
int a = 10, b = 6;
float c = 6f;
System.out.println(a / b);
System.out.println(a / c);
```

## Discussion

12. Why might `gearRatio` be a better variable name than `gr`?
13. How does using clear variable names make it easier to read a program and fix any logical errors?

------------------------------------------------------------------------

# Tutorial Questions -- Local Variables & Scope

## Local Variables

1.  How are local variables different from fields?
2.  When are local variables created and destroyed?

## Scope

3.  What do we mean by the *scope* of a variable?
4.  Explain why the following will not compile:

``` java
{
    int x = 5;
}
System.out.println(x);
```

## Refund Example

5.  If we wish the `refundBalance` method to reset the balance to zero and return the original balance, why does this method fail?

``` java
public int refundBalance() {
    return balance;
    balance = 0;
}
```

6.  How can we fix it?

## Block Scope

7.  In the method below, which lines will compile successfully?

``` java
public void scopeDemo(int param) {
    int localVar = 5;
    {
        int innerVar = 10;
        System.out.println(param + localVar + innerVar); // Line A
    }
    System.out.println(param + localVar); // Line B
    System.out.println(innerVar); // Line C
}
```

## Lifetime

8.  What is the lifetime of:
    -   a field?
    -   a local variable?

## Thinking Question

9.  Why does Java restrict access to variables outside their scope?
10. How does this help prevent bugs?
