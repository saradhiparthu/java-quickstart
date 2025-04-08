package stream.groupBy;

import stream.Employee;
import stream.EmployeeData;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample1 {

    public static void main(String[] args) {

        Map<LocalDate, List<Employee>> map = EmployeeData.getEmployees()
                .stream()
                .collect(Collectors.groupingBy(Employee::getJoiningDate));
    }
}
