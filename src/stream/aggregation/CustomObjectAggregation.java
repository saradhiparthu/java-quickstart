package stream.aggregation;

import java.util.List;
import java.util.Optional;

public class CustomObjectAggregation {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", 5000),
                new Employee("Bob", 7000),
                new Employee("Charlie", 6000)
        );

        // Accumulator logic for salary stream.aggregation
        double totalSalary = employees.stream()
                .map(emp -> emp.salary)   // Extract salary
                .reduce(0.0, (a, b) -> a + b);

        System.out.println("Total Salary: $" + totalSalary);
        Optional<Employee> highestPaidEmployee = employees.stream()
                .reduce((a, b) -> a.salary > b.salary ? a : b);

        highestPaidEmployee.ifPresent(emp ->
                System.out.println("Highest Paid Employee: " + emp.name + " ($" + emp.salary + ")")
        );


    }
}

