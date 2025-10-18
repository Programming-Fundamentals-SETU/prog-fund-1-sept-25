---
title: "UML Class Diagram - Person"
icon:
  type: oui:users
  color: light-blue
---

# Person Class Diagram

This document describes the UML representation of the `Person` class from the BlueJ project.

---

## 📘 Class Overview

The `Person` class models a simple person object with four attributes and several methods for accessing, modifying, and printing their details.

### **Attributes**

| Visibility | Type | Name | Description |
|-------------|------|------|-------------|
| `private` | `int` | `age` | The person’s age |
| `private` | `String` | `firstName` | The person’s first name |
| `private` | `String` | `secondName` | The person’s last name |
| `private` | `float` | `temperature` | The current temperature (default 13.2f) |

### **Constructor**

| Visibility | Signature | Description |
|-------------|------------|-------------|
| `public` | `Person(String firstName, String secondName, int age)` | Creates a new person with the specified name and age |

### **Methods**

| Visibility | Return Type | Method | Description |
|-------------|--------------|---------|-------------|
| `public` | `int` | `getAge()` | Returns the person’s age |
| `public` | `String` | `getFirstName()` | Returns the person’s first name |
| `public` | `String` | `getSecondName()` | Returns the person’s last name |
| `public` | `float` | `getTemperature()` | Returns today’s temperature |
| `public` | `void` | `setAge(int age)` | Updates the person’s age |
| `public` | `void` | `setFirstName(String firstName)` | Updates the first name |
| `public` | `void` | `setSecondName(String secondName)` | Updates the second name |
| `public` | `void` | `setTemperature(float temperature)` | Updates the temperature |
| `public` | `void` | `printAge()` | Prints the person’s age |
| `public` | `void` | `printFirstName()` | Prints the first name |
| `public` | `void` | `printFullName()` | Prints the full name |
| `public` | `void` | `printTemperature()` | Prints today’s temperature |
| `public` | `int` | `happyBirthday()` | Increases age by 1 and returns the previous age |

---

## 🧩 UML Diagram (PlantUML)

```plantuml
@startuml
title Person Class Diagram

class Person {
    - int age
    - String firstName
    - String secondName
    - float temperature

    + Person(String firstName, String secondName, int age)
    + int getAge()
    + String getFirstName()
    + String getSecondName()
    + float getTemperature()
    + void setAge(int age)
    + void setFirstName(String firstName)
    + void setSecondName(String firstName)
    + void setTemperature(float temperature)
    + void printAge()
    + void printFirstName()
    + void printFullName()
    + void printTemperature()
    + int happyBirthday()
}
@enduml
