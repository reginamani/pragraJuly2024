package aug24;

public class EmployeeS extends Person{

    private int empID;
    private double hourlyWage;
    private double hoursWorked;

    public EmployeeS(String firstName, String lastName, String email, Address1 address1, int empID,
                     double hourlyWage, double hoursWorked) {
        super(firstName, lastName, email, address1);
        this.empID = empID;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public int getEmpID() {
        return empID;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary(){
        return hourlyWage * hoursWorked;
    }
    public void displayEmployeeDetail(){
        displayPersonDetails();
        System.out.println("Empid: "+empID);
        System.out.println("Hourly Wage: "+hourlyWage);
        System.out.println("Hours worked: "+hoursWorked);
        System.out.println("Salary: "+this.calculateSalary());
    }
}
