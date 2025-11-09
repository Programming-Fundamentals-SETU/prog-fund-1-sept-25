---
title: "Tutorial – Objects, Classes, and Arrays (Shop & Gym Example) – Solutions"
module: "Programming Fundamentals"
---

# Solutions – Objects, Classes, and Arrays (Shop & Gym Example)

These sample solutions illustrate typical answers and coding structure for each tutorial question.

---

## Exercise 1 – Object-Oriented Concepts

1. **Class**  
2. **Object**  
3. **new**  
4. **private**  
5. **fields** and **methods**  

---

## Exercise 2 – Basic Class Definition

```java
public class Product {
    private String name;
    private double price;
    private boolean inStock;

    public Product(String name, double price, boolean inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public boolean isInStock() { return inStock; }

    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
    public void setInStock(boolean inStock) { this.inStock = inStock; }

    public String toString() {
        return name + " - €" + price + " - In stock: " + inStock;
    }
}
```

---

## Exercise 3 – Constructor and Object Creation

```java
public class ProductDriver {
    public static void main(String[] args) {
        Product p1 = new Product("Notebook", 4.99, true);
        System.out.println(p1);
    }
}
```

**Output:**
```
Notebook - €4.99 - In stock: true
```

---

## Exercise 4 – Adding Validation

```java
public void setPrice(double price) {
    if (price >= 0) {
        this.price = price;
    } else {
        System.out.println("Error: price cannot be negative.");
    }
}

public void setName(String name) {
    if (name != null && !name.isEmpty()) {
        this.name = name;
    } else {
        System.out.println("Error: name cannot be blank.");
    }
}
```

---

## Exercise 5 – GymMember Class (Updated Validation Rules)

```java
public class GymMember {
    private String name;
    private double height; // in metres
    private double weight; // in kilograms
    private boolean activeMembership;

    public GymMember(String name, double height, double weight, boolean activeMembership) {
        setName(name);
        setHeight(height);
        setWeight(weight);
        this.activeMembership = activeMembership;
    }

    public void setName(String name) {
        if (name != null && name.length() >= 3) {
            this.name = name;
        } else {
            System.out.println("Error: name must be at least 3 characters.");
        }
    }

    public void setHeight(double height) {
        if (height >= 1.2 && height <= 2.3) {
            this.height = height;
        } else {
            System.out.println("Error: height must be between 1.2 and 2.3 metres.");
        }
    }

    public void setWeight(double weight) {
        if (weight >= 35 && weight <= 250) {
            this.weight = weight;
        } else {
            System.out.println("Error: weight must be between 35 and 250 kg.");
        }
    }

    public String toString() {
        return name + ", Height: " + height + "m, Weight: " + weight + "kg, Active: " + activeMembership;
    }
}
```

---

## Exercise 6 – Working with a Driver Class

```java
public class GymDriver {
    public static void main(String[] args) {
        GymMember gm1 = new GymMember("Alice", 1.68, 60.5, true);
        GymMember gm2 = new GymMember("Bob", 1.75, 82.0, false);

        System.out.println(gm1);
        System.out.println(gm2);

        gm2.setWeight(260); // invalid, triggers validation
        gm2.setWeight(79.0); // valid update
        System.out.println(gm2);
    }
}
```

---

## Exercise 7 – Arrays of Objects (Custom Inventory)

```java
public class Inventory {
    private Product[] stock;
    private int total;

    public Inventory(int size) {
        stock = new Product[size];
        total = 0;
    }

    public void addItem(Product p) {
        if (total < stock.length && !hasProduct(p.getName())) {
            stock[total] = p;
            total++;
        } else {
            System.out.println("Error: inventory full or duplicate item.");
        }
    }

    public Product findItem(String name) {
        for (int i = 0; i < total; i++) {
            if (stock[i].getName().equalsIgnoreCase(name)) {
                return stock[i];
            }
        }
        return null;
    }

    private boolean hasProduct(String name) {
        for (int i = 0; i < total; i++) {
            if (stock[i].getName().equalsIgnoreCase(name)) return true;
        }
        return false;
    }
}
```

---

## Exercise 8 – Boolean Helper Methods

```java
public boolean isFull() {
    return total >= stock.length;
}

public boolean hasProduct(String name) {
    for (int i = 0; i < total; i++) {
        if (stock[i].getName().equalsIgnoreCase(name)) {
            return true;
        }
    }
    return false;
}
```

**Explanation:** These methods simplify logic within other methods (e.g. `addItem` and `listProducts`) and make the code more readable.

---

## Exercise 9 – Extended Functionality (Analytical Methods)

```java
public Product mostExpensiveProduct() {
    if (total == 0) return null;
    Product highest = stock[0];
    for (int i = 1; i < total; i++) {
        if (stock[i].getPrice() > highest.getPrice()) {
            highest = stock[i];
        }
    }
    return highest;
}

public int countInStock() {
    int count = 0;
    for (int i = 0; i < total; i++) {
        if (stock[i].isInStock()) count++;
    }
    return count;
}

public double percentageInStock() {
    if (total == 0) return 0;
    return (countInStock() * 100.0) / total;
}
```

---

## Exercise 10 – Application Integration

```java
public class InventoryDriver {
    public static void main(String[] args) {
        Inventory inv = new Inventory(5);

        inv.addItem(new Product("Shampoo", 5.99, true));
        inv.addItem(new Product("Conditioner", 6.49, true));
        inv.addItem(new Product("Body Wash", 4.50, false));

        System.out.println("Most expensive: " + inv.mostExpensiveProduct());
        System.out.println("Items in stock: " + inv.countInStock());
        System.out.println("Percentage available: " + inv.percentageInStock() + "%");
    }
}
```

---

**End of Solutions**