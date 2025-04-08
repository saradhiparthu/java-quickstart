package stream.map;

import stream.Employee;
import stream.EmployeeData;

import java.util.Map;
import java.util.stream.Collectors;

public class MapExample {

    public static void main(String[] args) {

      Map<Integer,String> map=  EmployeeData.getEmployees()
                .stream()
                .collect(Collectors.toMap(Employee::getId,Employee::getName));
    }
}
