package aug20.aggregation;

public class EmployeeName {
    int id;
    String firstName;
    String lastName;
    String email;
    AddressEmp address;

    public EmployeeName(int id, String firstName, String lastName, String email, AddressEmp address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }
}
