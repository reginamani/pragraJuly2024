package july27;

import java.util.Scanner;

public class PracticeDemo3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Head count : ");
        int count = scanner.nextInt();

        System.out.println("Enter the no of meals for each: ");
        int[] foodCount = new int[count];

        for(int i=0; i<count; i++){
            foodCount[i] = scanner.nextInt();
        }

        System.out.println("Total meals orderd : " +sumOfArray1(foodCount));


    }

    public static int sumOfArray1(int[] arr){
        int sum =0;
        for (int i =0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void printArray6(int[] arr){
        for (int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
