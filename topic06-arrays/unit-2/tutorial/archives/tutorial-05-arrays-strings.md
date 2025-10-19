---
icon:
  type: oui:list-array
  color: blue
title: Arrays and Strings
---

# Tutorial 05 — Arrays and Strings

## Part 1 – Primitive Arrays

### 1. Why use arrays?
1. Consider the following program that reads ten numbers and prints their total:
   ```java
   Scanner input = new Scanner(System.in);
   int n;
   int sum = 0;

   for (int i = 0; i < 10; i++) {
       n = input.nextInt();
       sum += n;
   }

   System.out.println("The sum of the values you typed in is: " + sum);
   ```
   - What happens to the value of `n` each time through the loop?
   - Why does the program “forget” the previous inputs?

2. What kind of data structure would allow the program to **remember all ten numbers** for later use?

---

### 2. Declaring arrays
1. Write a single statement that:
   - Declares an array of ten integers called `numbers`.
   - Creates the array in the same line.

2. What value does each element contain when the array is first created?

3. Write statements to:
   - Store `12` in the first element,
   - Store `18` in the third element,
   - Print the value stored at index `2`.

---

### 3. Using arrays to remember numbers
1. The following code stores the ten numbers typed in by the user and then sums them:
   ```java
   Scanner input = new Scanner(System.in);
   int[] numbers = new int[10];
   int sum = 0;

   // read in ten numbers
   for (int i = 0; i < 10; i++) {
       numbers[i] = input.nextInt();
       sum += numbers[i];
   }

   System.out.println("The sum of the values you typed in is: " + sum);
   ```
   - Why is this version better than the one that uses only a single variable `n`?

2. Modify the program so that the user can decide **how many numbers** to enter:
   ```java
   System.out.println("How many numbers do you need?");
   int numData = input.nextInt();
   int[] numbers = new int[numData];
   int sum = 0;

   for (int i = 0; i < numData; i++) {
       numbers[i] = input.nextInt();
       sum += numbers[i];
   }

   System.out.println("The sum of the values you typed in is: " + sum);
   ```

---

### 4. Array size and populated data
1. A class has capacity for **15 students**, but only **12** sit the exam.  
   - Write code to create an array with room for 15 results.  
   - Store only the 12 actual marks in the first 12 elements.  
   - When calculating the average, what number should you divide by?

2. Why is it important to track how many elements are *populated* rather than assume the entire array is full?

---

## Part 2 – Arrays of Objects and Classes

### 1. Arrays of different types
1. Give Java statements to create each of the following:
   - An array of 10 integers  
   - An array of 4 `String` objects  
   - An array of 4 `Person` objects

2. What is initially stored in each element of:
   - a primitive array?
   - an object array?

---

### 2. Working with String arrays
1. Complete this program to declare, fill, and print an array of words:
   ```java
   String[] words = new String[4];
   words[1] = "Dog";
   words[3] = "Cat";

   for (int i = 0; i < words.length; i++) {
       System.out.println(words[i]);
   }
   ```

2. What output appears on the console?  
3. Why do some lines of the output show `null`?

---

### 3. Arrays of Person objects
1. Suppose you have a class:
   ```java
   public class Person {
       private String firstName;
       private String secondName;
       private int age;

       public Person(String f, String s, int a) {
           firstName = f;
           secondName = s;
           age = a;
       }

       public void printFirstName() {
           System.out.println(firstName);
       }

       public void printSecondName() {
           System.out.println(secondName);
       }
   }
   ```

2. Write code to create and use an array of `Person` objects:
   ```java
   Person[] friends = new Person[4];
   friends[0] = new Person("Joey", "Tribbiani", 25);
   friends[1] = new Person("Rachel", "Green", 24);
   friends[2] = new Person("Ross", "Geller", 27);
   friends[3] = new Person("Monica", "Geller", 26);
   ```

3. Add a loop to print all first names:
   ```java
   for (int i = 0; i < friends.length; i++) {
       friends[i].printFirstName();
   }
   ```

4. What happens if one of the array elements is not assigned an object?

---

### 4. Method that lists all friends
1. Write a method that returns the first and second names of all `Person` objects stored in the array.
   ```java
   public void listFriends() {
       for (int i = 0; i < friends.length; i++) {
           friends[i].printFirstName();
           friends[i].printSecondName();
       }
   }
   ```

---

## Part 3 – Strings and String Methods

### 1. Characters vs Strings
1. Compare:
   ```java
   char letter = 'A';
   String word = "A";
   ```
   - What type of data is each variable storing?
   - Why are single quotes used for one and double quotes for the other?

2. Decide whether each of the following is **valid** or **invalid**, and explain why:

| Code | Valid? | Reason |
|------|---------|--------|
| `char letter = n;` |  |  |
| `char letter = "n";` |  |  |
| `String letter = 'n';` |  |  |
| `String letter = "n";` |  |  |

---

### 2. Creating and using Strings
1. Create a `String` variable called `greeting` that stores `"Hello World!"`.  
2. What type of object is `String`?  
3. How does it differ from the primitive `char` type?

---

### 3. Using String methods and dot notation
1. Given:
   ```java
   String name = "Joe Soap";
   ```
   - Write a statement that prints the number of characters in `name`.  
   - Write a statement that converts the value to lowercase and prints it.  
   - Write a statement that removes spaces at the start and end.

2. Each method call should use **dot notation**, e.g. `name.length()`.

---

### 4. Practice with String methods
Given:
```java
String greeting = "   Hello World!   ";
```
Write code to:
1. Print the value of `greeting.length()`.  
2. Remove the extra spaces using `trim()`.  
3. Convert it to uppercase with `toUpperCase()`.  
4. Replace `"World"` with `"Java"` using `replace()` and print the result.

---

### 5. Reflection
1. Why are Strings called *objects* rather than *primitive* types?  
2. How can knowing the available `String` methods help reduce coding effort?

---
