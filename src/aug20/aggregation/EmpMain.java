package aug20.aggregation;

public class EmpMain {
    public static void main(String[] args) {

        EmployeeName employeeName = new EmployeeName(101,"Regina","Mani","regi.mani@gmail.com",
                new AddressEmp("sauve st","milton","Canada","L9t9a5"));

        System.out.println(employeeName.lastName);
        System.out.println(employeeName.address.country);
    }
}
