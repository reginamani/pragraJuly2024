package aug12;

public class ReverseAnArray {

    public static void main(String[] args) {

        int[] givenArray = {10,20,30,40,50};
        System.out.println("Original array: ");
        printArray(givenArray);

        reverseArray(givenArray);
        System.out.println("reversed array: ");
        printArray(givenArray);

    }

    public static void reverseArray(int[] arr){

        //  --->    10  20  30  40  50    <-----
        //          0   1   2   3   4

        int start = 0;           // 0
        int end = arr.length-1;  // 4
        // DRY
        int temp;

        //     0 < 4
        while (start < end ) {
            // temp = 4
            temp = arr[end];
            // end    = 0
            arr[end] = arr[start];
            arr[start] = temp;
            start ++;
            end --;
        }
    }

    public static void printArray(int[] array){
        for (int i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
// int max = 0;
// arr = {10,20,45,23,23,53,54};
// find the max element from array
// min

