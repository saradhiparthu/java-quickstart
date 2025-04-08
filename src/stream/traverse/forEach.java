package stream.traverse;

import stream.EmployeeData;

public class forEach {

    public static void main(String[] args) {
        EmployeeData.getEmployees().forEach(e -> System.out.println(e.getName()));
    }
}
