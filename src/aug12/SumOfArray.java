package aug12;

public class SumOfArray {
    public static void main(String[] args) {

        int[] givenArray = {10,20,30,40,50};
        System.out.println("Given array is: ");

        for (int element: givenArray) {
            System.out.print(element + " ");
            System.out.println();
        }
        //sumOfArray(givenArray);
        System.out.println("Sum of the array: "+sumOfArray(givenArray));
    }

    public static int sumOfArray(int[] arr){

        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;

    }
}
