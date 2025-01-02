package practice;

public class ReverseInteger {

    public static void main(String[] args) {

        int[] array = {100,200,300,400};
        printArray(array);
        System.out.println();
        reverseArray(array);
        printArray(array);


    }


    public static void reverseArray(int[] arr){

        int start = 0;
        int end = arr.length-1;
        int temp;

        while(start<end){
            temp = arr[start];
            arr[start]=arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
