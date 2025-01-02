package oct5;

import java.util.List;

public class Student {

    private String name;
    private int rollNo;
    private List<String> phoneNo;

    public Student(String name, int rollNo, List<String> phoneNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public List<String> getPhoneNo() {
        return phoneNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
