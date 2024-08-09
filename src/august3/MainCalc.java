package august3;
import java.util.Scanner;

public class MainCalc {

    public static void main(String[] args) {


        System.out.println("*********");
        System.out.println("Welcome to my Calculator");
        System.out.println("*********");

        System.out.println("1.Addition");
        System.out.println("2.Multiplication");
        System.out.println("3.Subtraction");
        System.out.println("4.Division");
        System.out.println("5.Modulus");
        System.out.println("0.Exit");


        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        char continueCalc;

        do{
            System.out.println("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Enter the operation ");
            int input = scanner.nextInt();

            switch (input){

                case 1:
                    System.out.println("Addition of "+num1+"+"+num2+" = "+calc.add(num1,num2));
                    break;

                case 2:
                    System.out.println("Subtraction of"+num1+"-"+num2+" = "+calc.subtract(num1,num2));
                    break;

                case 3:
                    System.out.println("Multiplication of "+num1+"*"+num2+" = "+calc.multiply(num1,num2));
                    break;

                case 4:
                    System.out.println("Division of "+num1+"/"+num2+" = "+calc.divide(num1,num2));
                    break;

                case 5:
                    System.out.println("Modulus of "+num1+"%"+num2+" = "+calc.modulus(num1,num2));
                    break;

                case 0:
                    System.out.println("Exit");
                    break;

                    default:

                    System.out.println("Invalid option! Press 0 to 5");
                    break;
            }
            System.out.println("Do you want to continue? (y/n)");
            continueCalc = scanner.next().charAt(0);
        }while(continueCalc == 'Y' || continueCalc == 'y');

        scanner.close();

    }
}
