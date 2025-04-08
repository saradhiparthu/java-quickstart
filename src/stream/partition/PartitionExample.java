package stream.partition;

import stream.Employee;
import stream.EmployeeData;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionExample {
    public static void main(String[] args) {
        Map<Boolean, List<Employee>> map = EmployeeData.getEmployees()
                .stream()
                .collect(Collectors.partitioningBy(e -> e.getDepartment().equals("HR")));
    }
}