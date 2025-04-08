package stream;

import java.time.LocalDate;
import java.util.*;

public class EmployeeData {
    public static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(101, "Alice", 75000, "HR", true, LocalDate.of(2020, 1, 15)),
                new Employee(102, "Bob", 85000, "IT", true, LocalDate.of(2019, 3, 10)),
                new Employee(103, "Charlie", 65000, "Finance", false, LocalDate.of(2021, 5, 5)),
                new Employee(104, "David", 95000, "IT", true, LocalDate.of(2018, 8, 22)),
                new Employee(105, "Eve", 55000, "HR", false, LocalDate.of(2022, 2, 12))
        );
    }
}