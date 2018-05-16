package priv.monkey.learn.java.design_pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subEmployee;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subEmployee = new ArrayList<>();
    }

    public void add(Employee e) {
        subEmployee.add(e);
    }

    public void remove(Employee e) {
        subEmployee.remove(e);
    }

    public List<Employee> getSubEmployee() {
        return subEmployee;
    }

    public String toString() {
        return  ("Employee :[ Name: "+ name
                +", dept: "+ dept + ", salary:"
                + salary+" ]");
    }
}
