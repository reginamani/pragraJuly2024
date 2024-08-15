package aug10;
import java.util.Scanner;

public class DemoArray {
    public static void main(String[] args) {

        System.out.println("Enter the number of Students: ");
        Scanner scanner = new Scanner(System.in);
        int students = scanner.nextInt();

        int[] array = new int[students];

        System.out.println("Enter the Student RollNo: ");

        for(int i=0; i<students; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("The Student RollNo are listed below:");

        for (int i=0; i<students; i++){
            System.out.print(array[i] + " ");
        }
    }
}
