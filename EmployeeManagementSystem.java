import java.util.*;

public interface EmployeeManagementSystem
{
    void addEmployee(Employee employee);

    void removeEmployee(int id);

    double calculateTotalSalary();

    List<Employee> getAllEmployees();
}