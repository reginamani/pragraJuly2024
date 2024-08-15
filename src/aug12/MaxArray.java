package aug12;

public class MaxArray {
    public static void main(String[] args) {

        int[] givenArray = {100, 200, 300, 400, 500};
        System.out.println("Given array is: ");

        for (int element : givenArray) {
            System.out.print(element + " ");
            System.out.println();
        }
        System.out.println("Max value in the array: " + maxArray(givenArray));

        System.out.println("Min value in the array: " + minArray(givenArray));

    }

    public static int maxArray(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


          public static int minArray(int[] arr){

        int min = arr[0];

              for(int i=1; i< arr.length; i++) {

                  if (arr[i] < min) {
                      min = arr[i];
                  }
              }
                  return min;

          }
}
