public class FullTimeEmployee extends Employee
{
    private double bonusPercentage;

    public FullTimeEmployee(int ID, String name, double salary, double bonusPercentage) {
        super(ID, name, salary);
        this.bonusPercentage = bonusPercentage;
    }

    @Override
    public double calculateSalary() {
        return getSalary() * (1 + bonusPercentage / 100);
    }
}