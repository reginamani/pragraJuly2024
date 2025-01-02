package oct5;

class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private String companyName;
    private double salary;

    public Employee(String firstName, String lastName, int age, String companyName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.companyName = companyName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
