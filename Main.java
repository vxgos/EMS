import java.util.*;

public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystemImpl system = new EmployeeManagementSystemImpl();

        Employee fullTimeEmployee = new FullTimeEmployee(1976467, "John", 50000, 10);
        Employee partTimeEmployee = new PartTimeEmployee(2097269, "Alice", 0, 20, 30);
        system.addEmployee(fullTimeEmployee);
        system.addEmployee(partTimeEmployee);

        System.out.println("Total Salary: $ " + system.calculateTotalSalary());

        system.removeEmployee(1);

        List<Employee> allEmployees = system.getAllEmployees();
        System.out.println("Remaining Employees:");
        for (Employee employee : allEmployees) {
            System.out.println(employee);
        }
    }
}