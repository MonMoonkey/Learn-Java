package priv.monkey.learn.java.design_pattern.structural.composite;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee CEO = new Employee("AAA", "CEO", 110000);
        Employee Director = new Employee("BBB", "Technical Director", 90000);
        Employee Head1 = new Employee("CCC", "Head", 70000);
        Employee Head2 = new Employee("DDD", "Head", 70000);
        Employee Senior1 = new Employee("EEE", "Senior", 50000);
        Employee Senior2 = new Employee("FFF", "Senior", 50000);
        Employee Senior3 = new Employee("GGG", "Senior", 50000);
        Employee Ordinary1 = new Employee("HHH", "Ordinary", 20000);
        Employee Ordinary2 = new Employee("III", "Ordinary", 20000);
        Employee Intern1 = new Employee("JJJ", "Intern", 8000);
        Employee Intern2 = new Employee("KKK", "Intern", 8000);


        CEO.add(Director);
        Director.add(Head1);
        Director.add(Head2);
        Head1.add(Senior1);
        Head1.add(Senior2);
        Senior1.add(Ordinary1);
        Ordinary1.add(Intern1);
        Head2.add(Senior3);
        Senior3.add(Ordinary2);
        Ordinary2.add(Intern2);

        System.out.println("All employees:");
        printEmployee(CEO);
//        System.out.println(CEO.toString());
//        for(Employee e:CEO.getSubEmployee())


    }

    private static void printEmployee(Employee employee) {
        System.out.println(employee.toString());
        List<Employee> employees = employee.getSubEmployee();
        if (employees.size() > 0) {
            for (Employee e : employees) {
                printEmployee(e);
            }
        }
    }
}
