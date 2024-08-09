package july27;
import java.util.Scanner;

public class DemoLoop1 {
    public static void main(String[] args) {

        System.out.println("Enter table for multiplication");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("Multiplication table of "+input+ ":");

        /*for(int i=1 ; i<=10; i++){

            int multiply = input * i;
            System.out.println(input+" x "+i+ " = "+multiply);
        }*/

        int i=1;

        do
        {
            int multiply = input * i;
            System.out.println(input+ " X "+i+ " = "+multiply);
            i++;
        }while (i<=10);

    }
}
