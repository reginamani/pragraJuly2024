package aug17;

public class SortArray {

    public static void main(String[] args) {

        int[] array = {7,11,2,5,1,0};

        sortArray(array);
        System.out.println("Sorted Array:");
        for (int arr:array){
            System.out.print(arr+" ");
        }

    }

    public static void sortArray(int[] arr){

        for (int i=0;i<arr.length-1;i++){
            int minIndex = i;

            for (int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
