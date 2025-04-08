package collections.list;

import java.util.*;

public class RemoveCustomDuplicates {
    public static void main(String[] args) {
        // Removing Duplicates from List of Employee
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice"));
        employees.add(new Employee(102, "Bob"));
        employees.add(new Employee(101, "Alice"));  // duplicate
        employees.add(new Employee(103, "Charlie"));
        // Remove duplicates using LinkedHashSet
        Set<Employee> uniqueSet = new LinkedHashSet<>(employees);
        List<Employee> uniqueList = new ArrayList<>(uniqueSet);

        System.out.println("Original List:");
        employees.forEach(System.out::println);

        System.out.println("\nList without Duplicates:");
        uniqueList.forEach(System.out::println);
        // Java 8+, you could also do it with streams, but still need equals and hashCode
        List<Employee> uniqueListJava8 = employees.stream()
                .distinct().toList();
    }
}

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}