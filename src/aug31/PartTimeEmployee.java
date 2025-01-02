package aug31;

public class PartTimeEmployee extends Employee {

    private int hoursWorked;

    public PartTimeEmployee(int id, String name, double salary, int hoursWorked) {
        super(id, name, salary);
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.05;
    }
}
