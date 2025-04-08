package stream.traverse;

import stream.EmployeeData;

public class forEachOrdered {

    public static void main(String[] args) {
        EmployeeData.getEmployees()
                .stream()
                .parallel()
                .forEachOrdered( e -> System.out.println(e.getName()));
    }
}
