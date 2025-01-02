package aug24;

public class Person {
    String firstName;
    String lastName;
    String email;
    Address1 address1;


    public Person(String firstName, String lastName, String email, Address1 address1) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address1 = address1;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayPersonDetails(){
        System.out.println("Name: " +firstName+lastName);
        System.out.println("Email: "+email);
    }
}
