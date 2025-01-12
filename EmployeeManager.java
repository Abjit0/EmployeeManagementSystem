package Tutorial8;

import java.util.*;

public class EmployeeManager {
    public ArrayList<Employee> employees = new ArrayList<>();
    // Add an employee to the list
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    // Display all employees
    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}