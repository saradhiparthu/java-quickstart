
### **What is a Record in Java?**
A **record** is a special class in Java designed to be an immutable data carrier. This feature  introduced in **Java 14 (preview) and finalized in Java 16**.

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