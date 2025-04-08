package stream.filter;

import stream.Employee;
import stream.EmployeeData;

import java.util.List;
import java.util.stream.Collectors;

public class FilterExample1 {
    public static void main(String[] args) {

        List<Employee> filterEmployees = EmployeeData.getEmployees()
                .stream()
                .filter(e -> e.getSalary() > 500)
                .collect(Collectors.toList());
    }
}
