package aug24;

public class ManagerS extends EmployeeS{

    private double bonus;

    public ManagerS(String firstName, String lastName, String email, Address1 address1,
                    int empID, double hourlyWage, double hoursWorked, double bonus) {
        super(firstName, lastName, email, address1, empID, hourlyWage, hoursWorked);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }

    @Override
    public void displayEmployeeDetail() {

        double baseSalary = super.calculateSalary();
        double totalSalary = this.calculateSalary();
        super.displayEmployeeDetail();
        System.out.println("Base Salary: "+baseSalary);
        System.out.println("Bonus: "+bonus);
        System.out.println("Salary(includes bonus): "+totalSalary);
    }
}
