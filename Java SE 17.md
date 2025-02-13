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
static void printType(Object obj) {
    switch (obj) {
        case String s -> System.out.println("String: " + s);
        case Integer i -> System.out.println("Integer: " + i);
        case null -> System.out.println("Null value");
        default -> System.out.println("Unknown type");
    }
}
```
### **Key Features:**
- Eliminates `instanceof` checks and explicit casting.
- Works with both primitive and reference types.
- Supports `null` handling inside `switch`.