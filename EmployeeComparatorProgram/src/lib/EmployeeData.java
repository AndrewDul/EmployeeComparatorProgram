package lib;

import java.util.Arrays;
import java.util.List;

public class EmployeeData {
    public static List<Employee> getSampleEmployees() {
        return Arrays.asList(
            new Employee("John", 30, 50000),
            new Employee("Jane", 25, 60000),
            new Employee("Jack", 35, 55000),
            new Employee("Jill", 28, 65000),
            new Employee("Jim", 40, 70000)
        );
    }
}