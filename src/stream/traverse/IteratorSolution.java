package stream.traverse;

import stream.Employee;
import stream.EmployeeData;

import java.util.Iterator;

public class IteratorSolution {

    public static void main(String[] args) {
        Iterator<Employee> iterator = EmployeeData.getEmployees()
                .iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}
