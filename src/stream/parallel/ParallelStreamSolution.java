package stream.parallel;

import java.util.*;
import java.util.stream.*;
import java.util.concurrent.ThreadLocalRandom;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class ParallelStreamSolution {
    public static void main(String[] args) {
        // Creating 10,000 employee records
        List<Employee> employees = IntStream.rangeClosed(1, 10000)
                .mapToObj(i -> new Employee("stream.parallel.Employee " + i, ThreadLocalRandom.current().nextDouble(3000, 10000))).toList();

        // Parallel stream for faster salary processing
        long start = System.currentTimeMillis();

        double totalSalary = employees.parallelStream()
                .map(emp -> emp.salary * 1.10) // 10% bonus
                .reduce(0.0, Double::sum);

        long end = System.currentTimeMillis();

        System.out.println("Total Salary After Bonus: $" + totalSalary);
        System.out.println("Time Taken (Parallel): " + (end - start) + " ms");
    }
}
