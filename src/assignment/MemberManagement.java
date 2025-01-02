package assignment;

public class MemberManagement {
    private Member[] members;
    int memberCapacity;

    public MemberManagement(int memberCapacity) {
        members = new Member[memberCapacity];
        memberCapacity=0;
    }

    public void addMember(String name){
        if(memberCapacity<members.length) {
            members[memberCapacity] = new Member(name);
            memberCapacity++;
        }
            else{
            System.out.println("No more spot! cant add new member");
            }
        }


 public int findMemberByID(int memberID){
        for(int i=0; i<memberCapacity; i++){
            if(members[i].getMemberID()==memberID)
                return i;
        }
        return -1;

 }

 public void displayMemberDetails(int memberIndex){
    if(memberIndex>=0 && memberIndex<memberCapacity){
         System.out.println(members[memberIndex]);
    }
    else {
        System.out.println("Member not found");
        }
    }

    public void displayAll(){
        if(memberCapacity==0){
            System.out.println("No members: ");
        }else {
            for(int i=0; i<memberCapacity; i++){
                System.out.println(i+1 +"."+members[i]);
            }
        }
    }

   /*
   public void printAll(){
        for (Member i:members){
            System.out.println(i);
        }

    }

    */

 //main method for testing
 public static void main(String[] args) {
        MemberManagement memberMgt = new MemberManagement(25);
        memberMgt.addMember("Regina");
        memberMgt.addMember("Peter");
        memberMgt.addMember("Mani");

        int searchMemberID = 0;
        memberMgt.findMemberByID(searchMemberID);
        System.out.println("Index of MemberID: "+searchMemberID);
        memberMgt.displayMemberDetails(searchMemberID);
        System.out.println();

        memberMgt.displayAll();
     }

}
