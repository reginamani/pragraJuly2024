package august3;
import java.util.Scanner;

public class CalcultorDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("*********");
        System.out.println("Welcome to my Calculator");
        System.out.println("*********");

        System.out.println("1.Addition");
        System.out.println("2.Multiplication");
        System.out.println("3.Subtraction");
        System.out.println("4.Division");
        System.out.println("5.Modulus");
        System.out.println("0.Exit");

        Scanner scanner = new Scanner(System.in);
        char continueCalculation;

        do {

            System.out.println("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Enter the operation ");
            int input = scanner.nextInt();


            double result;


            switch(input)
            {
                case 1:
                    result = num1 + num2;
                    System.out.println("The sum of " + num1 + "+" + num2 + " = "+ result );
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println("The subtraction of " + num1 + "-" + num2 + " = " + result );
                    break;

                case 3:
                    result = num1 * num2;
                    System.out.println("The multiplication of " + num1 + "*" + num2 + " = " + result );
                    break;

                case 4:

                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("The division of " + num1 + "/" + num2 + " = " + result );
                    }
                    else {
                        System.out.println("Error! division by zero");
                    }
                    break;


                case 5:
                    result = num1 % num2;
                    System.out.println("The modulus of " + num1 + "%" + num2 + " = " + result );
                    break;

                case 0:
                    System.out.println("Exit" );
                    break;

                default:

                    System.out.println("Invalid option! Press 0 to 5");

            }




            System.out.println("Do you want to continue? (y/n): ");
            //char continueCalculation;
            continueCalculation = scanner.next().charAt(0);
        }while (continueCalculation == 'Y'|| continueCalculation == 'y');


        scanner.close();

    }
}
