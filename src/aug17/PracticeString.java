package aug17;

public class PracticeString {
    public static void main(String[] args) {

        String original4 = "Pragra";
        System.out.println("Original String: "+original4);

        String reverse4 ="";

       /*
        String reverse = reverseString(original);
        System.out.println("Reversed String: "+reverse);

        */

        /*
        String original5 = "PRAGRA";
        StringBuffer sb = new StringBuffer(original5);
        String reverse5 = sb.reverse().toString();
        System.out.println("Original: "+original5);
        System.out.println("Reversed: "+reverse5);

         */
        for (int i= original4.length()-1; i>=0;i--){

            reverse4 += original4.charAt(i);

        }
        System.out.println("Reversed String: "+reverse4);

    }

    /*
    //Reversing String using CharArray
    public static String reverseString(String str){

        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length-1;
        char temp;

        while (start<end){

            temp = arr[end];
            arr[end] = arr[start];
            arr[start]= temp;
            start++;
            end--;

        }
        return new String(arr);

    }
    */

}
