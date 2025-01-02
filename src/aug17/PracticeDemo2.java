package aug17;

public class PracticeDemo2 {

    public static void main(String[] args) {
        int[] array1 = {700,200,300,400,500};
        System.out.println("Original array: ");
        printArray3(array1);


        System.out.println("Maximum in the array : "+maxArray1(array1));
        System.out.println("Minimum in the array: "+MinArray1(array1));

        System.out.println("Reversed array: ");
        reverseArray2(array1);
        printArray3(array1);
        System.out.println();
        reverseArrayUsingFor(array1);
        //printArray3(array1);

    }

    public static void reverseArray2(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int temp;

        while (start<end){
            temp = arr[end];
            arr[end] = arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }

    public static void reverseArrayUsingFor(int[] arr){
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }


    public static int maxArray1(int[] arr){
        int max = arr[0];

        for (int i=1; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int MinArray1(int[] arr){
        int min = arr[0];

        for (int i=1; i<arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;

    }

public static void printArray3(int[] arr){
        for (int i: arr){
            System.out.print(i+ " ");
        }
    System.out.println();
}



}
