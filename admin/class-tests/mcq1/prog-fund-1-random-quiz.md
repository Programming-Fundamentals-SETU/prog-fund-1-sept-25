# Programming Fundamentals – Random Quiz

## Section A – Printable Version (With Answers, No Code)

**Q1.** What does the statement balance = balance + amount; do?
- A. Adds amount to the current value of balance.
- B. Creates a new variable.
- C. Swaps two values.
- D. Always resets balance to zero.

**Q2.** What must always be true about a constructor in Java?
- A. Its name must match the class name.
- B. It must always take at least one parameter.
- C. It must always return an int.
- D. It must always be private.

**Q3.** Which of these is the best choice for a variable name?
- A. ticketPrice
- B. t5
- C. xyz123
- D. q

**Q4.** In a constructor, parameters are typically used for what purpose?
- A. To initialize the fields of the new object.
- B. To create new methods.
- C. To declare the package.
- D. To print default messages.

**Q5.** 
Which are valid Java boolean literals/ keywords?

- (A) true and false
- (B) "true" and "false"
- (C) 1 and 0
- (D) Yes and No


**Q6.** 
Which expression tests equality of primitive ints correctly?

int a = 5, b = 5;

- (A) a = b
- (B) a == b
- (C) a != b
- (D) a equals b


**Q7.** For input mark, when is this condition true?

(mark >= 0) && (mark <=100)

- (A) When mark is between 0 and 100 inclusive
- (B) Only when mark is strictly between 0 and 100
- (C) When mark is negative
- (D) Always


**Q8.** For input mark, hen is this condition true?

(mark <= 0) || (mark > 100)

- (A) When mark is invalid (outside 0..100)
- (B) When mark is 0..100 inclusive
- (C) Never
- (D) Always


**Q9.** Given 

boolean isFriday = false;   
what is:

!isFriday

- (A) true
- (B) false
- (C) 0
- (D) null


**Q10.**
What does this code print?

boolean canVote = (age >= 18);
if (canVote) {
    System.out.println("You can vote!");
}

- (A) "You can vote!" when age >= 18
- (B) It never prints
- (C) It prints only when age == 18
- (D) Compilation error


**Q11.** Evaluate the following expression according to Java precedence:

3 + 6 * 5 - 2

- (A) 37
- (B) 31
- (C) 49
- (D) 25


**Q11.**
What is wrong with this code?
~~~
if (x = 5) {
    System.out.println("Five");
}
~~~

- (A) Uses = instead of ==
- (B) Missing semicolon after if
- (C) Should use === in Java
- (D) Nothing is wrong


**Q12.** Which condition matches “age is a teenager (13–19 inclusive) or a senior (65+)”?

- (A) (age >= 13 && age <= 19 || age >= 65)
- (B) (age > 13 && age  65)
- (C) age >= 13 || age >= 65
- (D) age = 65


---

**Q13.** What is the effect of:

y *= 3;

- (A) Adds 3 to y
- (B) Multiplies y by 3
- (C) Sets y to 3
- (D) Divides y by 3


**Q14.** Given int a = 7, b = 2; what is the value of:

a / b

- (A) 3
- (B) 3.5
- (C) 4
- (D) Error


**Q15.** Given int a = 17, b = 5; what is:

a % b

- (A) 2
- (B) 3
- (C) 5
- (D) -2


**Q16.** What is the final value of x after this executes (assume int x = 4;)?

x -= 6;  // line 1
x += 3;  // line 2

- (A) 1
- (B) -3
- (C) -2
- (D) 7

**Q17.** In Java, how do you declare an array of 10 integers?

- (A) int numbers = new int(10);
- (B) int numbers[] = new int[10];
- (C) numbers = new int[10];
- (D) int numbers = [10];

**Q18.**What does numbers.length return?

- (A) The last index used
- (B) The total capacity of the array
- (C) The number of elements currently populated
- (D) The sum of all elements

**Q19.** Which of the following is a valid declaration for an array of String objects?

- (A) String words = new String(4);
- (B) String[] words = new String[4];
- (C) String words[] = {"Dog", "Cat"};
- (D) Both B and C

**Q20.**
In an array Person[] friends = new Person[4], what does each element initially contain?

- (A) A new Person object
- (B) A random value
- (C) null
- (D) Empty