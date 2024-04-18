public abstract class Employee
{
    private int ID;
    private String name;
    private double salary;

    public Employee(int ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }
    public abstract double calculateSalary();

    public int getId() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee id = " + ID + ", name = " + name + ", salary = " + salary;
    }
}
// ur a class 