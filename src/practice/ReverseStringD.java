package practice;

public class ReverseStringD {
    public static void main(String[] args) {

        String original = "Pragra";
        System.out.println("Orginal: "+original);

        reverseStringUsingFor(original);

        //String reversed = reverseString(original);
        //System.out.println("Reversed: "+reversed);
    }


    public static void reverseStringUsingFor(String str){
        String reverse = "";

        for(int i=str.length()-1; i>=0;i--){
            reverse += str.charAt(i);
        }
        System.out.println("Reversed: "+reverse);
    }


    public static String reverseString(String str){

        char[] array = str.toCharArray();

        int start = 0;
        int end = array.length-1;
        char temp1;

        while (start<end){
            temp1 = array[start];
            array[start]= array[end];
            array[end]=temp1;
            start++;
            end--;

        }
return new String(array);

        }

}
