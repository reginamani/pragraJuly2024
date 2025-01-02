package aug17;

public class StringReverse {
    public static void main(String[] args) {

        String original = "Pragra";
        String reversed = reverseArray(original);


        System.out.println("Original array: "+original);
        System.out.println("Reversed array: "+reversed);

       /* String reversed ="";

        for(int i =original.length()-1; i>=0; i--){
            reversed += original.charAt(i);
        }

        System.out.println("The original string: "+original);
        System.out.println("The reveresed string: "+reversed);

        */
    }

    public static String reverseArray(String str){

        char[] array = str.toCharArray();//convert string to char array

        int start = 0;
        int end = array.length-1;

        char temp;

        while(start<end){

            temp = array[end];
            array[end] = array[start];
            array[start]=temp;
            start++;
            end--;
        }
return new String(array);// char array back to string
    }
}
