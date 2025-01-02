package aug31;

public class EmployeeMain {

        public static void main(String[] args) {

            Employee[] emp1 = new Employee[4];

          emp1[0] = new FullTimeEmployee(1,"Regina",5000,10);
          emp1[1] = new FullTimeEmployee(2,"Peter",1000,5);
          emp1[2] = new PartTimeEmployee(3,"lisa",500,10);
          emp1[3] = new PartTimeEmployee(4,"Priya",2000,7);

            for(Employee emp: emp1){

                emp.displayEmployeeDetails();
                System.out.println();
            }



    }
}
