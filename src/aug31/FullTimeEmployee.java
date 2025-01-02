package aug31;

public class FullTimeEmployee extends Employee {

    private int annualLeaveDays;

    public FullTimeEmployee(int id, String name, double salary, int annualLeaveDays) {
        super(id, name, salary);
        this.annualLeaveDays = annualLeaveDays;
    }

    public int getAnnualLeaveDays() {
        return annualLeaveDays;
    }

    public void setAnnualLeaveDays(int annualLeaveDays) {
        this.annualLeaveDays = annualLeaveDays;
    }

    @Override
    public double calculateBonus() {
        return getSalary()*0.10;
    }
}
