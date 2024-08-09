package august3;
import java.util.Scanner;

public class LotterySystem {

    public static void main(String[] args) {

        System.out.println("Welcome to lottery system");

        for(int i=1; i<100; i++);

        int luckyNo = 55;
        Scanner scanner = new Scanner(System.in);


        for(int count=1; count<=3; count++) {

            System.out.println("Enter your lucky number between 1 to 100");
            int input= scanner.nextInt();

            if (input == luckyNo) {
                System.out.println("Congrats you are the winner");
                break;
            }
            else{
                if(count == 3){
                    System.out.println("Sorry no more chance");
                    break;
                }

            }
                System.out.println("oops not the lucky one! try again");

        }
    }
}
