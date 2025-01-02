package oct1;

public class DriveTest {

    public void issueLicense(String name, ITest iTest){
        if(iTest.testName(name)){
            System.out.println("License issued to "+name);
        }else {
            System.out.println("License not issued to "+name+ "name must be atleast 4 char");
        }
    }

    public static void main(String[] args) {

        //ITest nameTest = (String name) -> name.length() >=4;

        DriveTest driveTest = new DriveTest();

        driveTest.issueLicense("Regina",n -> n.length()>=4);
        driveTest.issueLicense("Ray",n -> n.length()>=4);
    }
}
