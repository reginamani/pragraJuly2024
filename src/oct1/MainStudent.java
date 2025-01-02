package oct1;

public class MainStudent {

    public static void main(String[] args) {

        StudentO stu = new StudentO("Regina","Mani",25);
        nameMapper nm = new nameMapper();
        nm.map(stu,s -> s.getfName()+" "+s.getlName());

    }
}
