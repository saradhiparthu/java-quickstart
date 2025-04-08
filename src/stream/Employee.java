package stream;

import java.time.LocalDate;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;
    private boolean permanent;
    private LocalDate joiningDate;

    // Constructor
    public Employee(int id, String name, double salary, String department, boolean permanent, LocalDate joiningDate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.permanent = permanent;
        this.joiningDate = joiningDate;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public boolean isPermanent() {
        return permanent;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + salary + " | " + department + " | " + permanent + " | " + joiningDate;
    }
}
