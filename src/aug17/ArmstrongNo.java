package aug17;

import java.util.Scanner;

public class ArmstrongNo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        if(isArmstrong(number)){
            System.out.println(number+" is a armstrong no");
        }else {
            System.out.println(number+" is not a armstrong");
        }


    }

    public static boolean isArmstrong(int num){

        int originalNum = num;
        int sum =0;
        int digits = String.valueOf(num).length();

        while (num>0){
            int digit = num%10;
            sum += Math.pow(digit,digits);
            num = num/10;
        }
        return sum==originalNum;

            }
}
