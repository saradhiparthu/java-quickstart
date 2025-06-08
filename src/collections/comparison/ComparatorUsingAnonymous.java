package collections.comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorUsingAnonymous {
    public static void main(String[] args) {
        List<Employee> people = new ArrayList<>();
        people.add(new Employee("Alice", 30));
        people.add(new Employee("Bob", 25));
        people.add(new Employee("Charlie", 25));
        people.add(new Employee("Dave", 30));
        // Using Anonymous Class (Before Java 8)
        // Anonymous class to compare by age first, then by name
        /*
        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee p1, Employee p2) {
                // First compare by age
                int ageComparison = Integer.compare(p1.getAge(), p2.getAge());
                if (ageComparison != 0) {
                    return ageComparison;
                }
                // If ages are the same, compare by name
                return p1.getName().compareTo(p2.getName());
            }
        };

        // Sort using the custom comparator
        Collections.sort(people, comparator); */

        // Using custom comparator class to compare by age and name
        Comparator<Employee> comparator = new EmployeeComparator();

        // Sort using the custom comparator
        Collections.sort(people, comparator);
        // Output the sorted list
        for (Employee employee : people) {
            System.out.println(employee);
        }
    }
}

class Employee {
    int age;
    String name;

    Employee(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.name + ":" + this.age;
    }
}

class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee p1, Employee p2) {
        // First compare by age
        int ageComparison = Integer.compare(p1.getAge(), p2.getAge());
        if (ageComparison != 0) {
            return ageComparison;
        }
        // If ages are the same, compare by name
        return p1.getName().compareTo(p2.getName());
    }
}
