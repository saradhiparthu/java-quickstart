**Switch Expressions (Preview)** were introduced in **Java 12** as part of **JEP 325**. The goal was to simplify the `switch` statement by making it more expressive, less error-prone, and more concise.
---
### 🛠️ **Key Changes in Java 12 Switch Expressions (Preview)**

1. **Switch as an Expression**: `switch` can now return a value.
2. **Arrow Syntax (`->`)**: More concise and readable syntax.
3. **No Fall-Through** with `->`: Unlike the traditional `case`, the `->` syntax does not fall through.
4. **`yield` Keyword** (Introduced later in Java 13): Java 12 used `break` with a value instead.

---

#### ✅ **Old Style (Java 11 and earlier)**
```java
public String getDay(int day) {
    String result;
    switch (day) {
        case 1:
            result = "Monday";
            break;
        case 2:
            result = "Tuesday";
            break;
        case 3:
            result = "Wednesday";
            break;
        default:
            result = "Invalid day";
    }
    return  result;
}
```
- 🐢 Verbose
- 🐛 Easy to introduce bugs with missing `break` statements

---

#### 🚀 **New Style (Java 12 - Preview)**

**1️⃣ Expression with Arrow (`->`)**
```java
public String getDay(int day) {
    String result = switch (day) {
        case 1 -> "Monday";
        case 2 -> "Tuesday";
        case 3 -> "Wednesday";
        default -> "Invalid day";
    };
    return result;
 }
```
- 🎯 **No fall-through** by default
- ✂️ **Concise** and **readable**

---

**2️⃣ Block with `break` for multi-line logic (Java 12)**
```java

public String getDay(int day) {
    String result = switch (day) {
        case 1 -> "Monday";
        case 2 -> "Tuesday";
        case 3 -> {
            System.out.println("Midweek day");
            break "Wednesday"; // In Java 12 preview, break with value was required.
        }
        default -> "Invalid day";
    };
}
```
- ⚠️ **`break` with value** was required here.
- This changed to `yield` in Java 13.

---

### 💡 **Key Differences and Gotchas**

| **Feature**              | **Java 11 (Traditional)**  | **Java 12 (Preview)**                    |
|--------------------------|----------------------------|------------------------------------------|
| **Syntax**               | `case X: break;`           | `case X ->`                              |
| **Switch as Expression** | ❌ No                       | ✅ Yes                                    |
| **Fall-through**         | ✅ Yes (default)            | 🚫 No (with `->`)                        |
| **Multiple Labels**      | ✅ Yes                      | ✅ Yes                                    |
| **Return Values**        | ❌ No                       | ✅ Yes                                    |
| **Keyword for Return**   | `break` (with value)       | Later changed to `yield` in Java 13      |

---
*Upgrades in Later Versions**
- **Java 13**: Introduced `yield` keyword instead of `break` with value.
- **Java 14**: Made `switch` expressions a standard feature (no preview required).

---

### **What is a Record in Java?**
A **record** is a special class in Java designed to be an immutable data carrier. This feature  introduced in **Java 14 (preview)** and finalized in Java 16.

It automatically generates:
- **Constructor**
- **Getters** (without the `get` prefix)
- **`toString()`**, **`equals()`**, and **`hashCode()`**

### **Equivalent Regular Class**
The following **traditional Java class**:
```java
class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() { return name; }
    public int age() { return age; }

    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
```
Can be **simplified** using a **record**:
```java
record Person(String name, int age) {}
```

### **Benefits of Using Records**
✅ Less boilerplate code  
✅ Immutable by default (all fields are `final`)  
✅ Auto-generated `toString()`, `equals()`, and `hashCode()`

### **Example Usage of the `Person` Record**
```java
public class RecordExample {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Bob", 30);

        System.out.println(p1); // Prints: Person[name=Alice, age=25]
        System.out.println(p1.name()); // Accessing fields
        System.out.println(p1.age());
    }
}
```
### **Key Takeaways**
- **Records** are best used for **data-only objects** (like DTOs).
- They are **immutable** and **lightweight**.
- Available from **Java 16+**.

# Java Language Changes
## ✅ Sealed Classes
Sealed classes restrict which other classes or interfaces can extend or implement them. This helps in better control over class hierarchies, ensuring only intended subclasses can inherit from a given class.
### **Syntax:**
```java
sealed class Vehicle permits Car, Truck { }

final class Car extends Vehicle { }

final class Truck extends Vehicle { }
```
### **Key Features:**
- A **sealed class** is declared using the `sealed` keyword.
- The `permits` clause specifies allowed subclasses.
- Subclasses must be:
	- **`final`** (preventing further extension) OR
	- **`sealed`** (allowing further controlled extension) OR
	- **`non-sealed`** (removing restrictions).
## ✅ Pattern Matching for `switch` Expressions and Statements
Pattern matching for `switch` allows matching and extracting values based on their types, reducing the need for explicit casting.
### **Basic Example:**
```java
static void printInfo(Object obj) {
	switch (obj) {
		case String s -> System.out.println("It's a string: " + s.toUpperCase());
		case Integer i -> System.out.println("It's an integer: " + (i * 2));
		case Double d -> System.out.println("It's a double: " + (d / 2));
		case Person p -> System.out.println("It's a person: " + p.name + ", Age: " + p.age);
		case null -> System.out.println("It's null!");
		default -> System.out.println("Unknown type!");
	}
}
```
### **Key Features:**
- Eliminates `instanceof` checks and explicit casting.
- Works with both primitive and reference types.
- Supports `null` handling inside `switch`.