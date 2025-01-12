package Tutorial8;


class Employee {
    int id;
    String name;
    String department;
    int salary;
    // Constructor
    public Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee: \n ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary;
    }
}