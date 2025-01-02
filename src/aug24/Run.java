package aug24;

public class Run {
    public static void main(String[] args) {


        ManagerS employeeS = new ManagerS("Mani","Regina","regi.mani@gmail.com",
                new Address1("110","sauve st","milton","l9t95"),
                102,40,7,1000);
        EmployeeS employeeS1 = new EmployeeS("Mani","R","r.mani@gmail.com",
                new Address1("110","sauve st","milton","l9t95"),
                101,40,7);

        System.out.println("Employee Details");
        System.out.println("****************");
        employeeS1.displayEmployeeDetail();
        System.out.println();

        employeeS.displayEmployeeDetail();


        //System.out.println("salary "+employeeS.calculateSalary());


    }
}
