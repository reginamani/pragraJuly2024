package assignment;

public class Member {

    private int memberID;
    private String name;
    private static int IDcounter = 1;

    public Member(String name) {
        this.memberID = IDcounter++;
        this.name = name;
    }

    public int getMemberID() {
        return memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberID=" + memberID +
                ", name='" + name + '\'' +
                '}';
    }
}
