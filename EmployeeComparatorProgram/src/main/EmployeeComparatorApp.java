package main;

import lib.Employee;
import lib.EmployeeData;
import lib.CustomInfo;

import java.util.List;

public class EmployeeComparatorApp {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getSampleEmployees();

        // Sort employees by salary using a lambda expression
        employees.sort((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println("Employees sorted by salary using lambda expression:");
        employees.forEach(System.out::println);

        // Sort employees by name
        employees.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
        System.out.println("\nEmployees sorted by name:");
        employees.forEach(System.out::println);

        // Implementing and displaying custom info
        System.out.println("\nCustom Info for Employees:");
        employees.forEach(employee -> {
            CustomInfo info = new CustomInfo() {
                @Override
                public String getInfo() {
                    return "Employee: " + employee.getName() + ", Age: " + employee.getAge() + ", Salary: $" + employee.getSalary();
                }

                @Override
                public void displayInfo() {
                    System.out.println(getInfo());
                }
            };
            info.displayInfo();
        });
    }
}
