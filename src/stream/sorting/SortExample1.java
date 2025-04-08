package stream.sorting;

import stream.Employee;
import stream.EmployeeData;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortExample1 {

    public static void main(String[] args) {
   List<Employee> sortedEmployes=  EmployeeData.getEmployees()
                .stream()
                .sorted(Comparator.comparing(Employee::getDepartment)
                        .thenComparing(Employee::getJoiningDate))
                .collect(Collectors.toList());
   sortedEmployes.forEach(e -> System.out.println(e.getName()));
    }
}
