import java.util.*;

public class EmployeeManagementSystemImpl implements EmployeeManagementSystem {
    private List<Employee> employees;

    public EmployeeManagementSystemImpl() {
        this.employees = new ArrayList<>();
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void removeEmployee(int id) {
        employees.removeIf(e -> e.getId() == id);
    }

    @Override
    public double calculateTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.calculateSalary();
        }
        return totalSalary;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees);
    }
}