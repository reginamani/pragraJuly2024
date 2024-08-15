package aug6;

public class PragraStudent {

    String name;
    String email;
    String address;
    String phoneNo;
    static String school ="Pragra";

    public PragraStudent(String name,String email,String address,String phoneNo){
        this.name= name;
        this.email = email;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public void displayStudent(){
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Address: "+address);
        System.out.println("PnoneNo: "+phoneNo);
        System.out.println("School: "+school);
    }


}
