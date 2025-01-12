package Tutorial8;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        // Create employees
        Employee emp1 = new Employee(1, "abjit", "HR", 2000);
        Employee emp2 = new Employee(2, "tashi", "IT", 3000);
        // Add employees to the manager
        manager.addEmployee(emp1);
        manager.addEmployee(emp2);
        // Display all employees
        manager.displayEmployees();
    }
}
