package aug17;


public class StringReverseDemo {

    public static void main(String[] args) {
        String original = "Dot saw I was Tod";
        String reversed = reverseString(original);

        System.out.println("Original String: "+original);
        System.out.println("Reversed String: "+reversed);
        System.out.println();
        reverseStringBuilder(original);
        System.out.println();
        System.out.println("Reverse string using CharArray: "+reverseStringCharArray(original));
    }


    public static String reverseString(String original){
        String reverse ="";

        for (int i = original.length()-1;i>=0;i-- ){
            reverse +=original.charAt(i);
        }
        return reverse;
    }



    public static void reverseStringBuilder(String original){
        StringBuilder sb = new StringBuilder(original);
        String reverse = sb.reverse().toString();
        System.out.println("original stringBuilder: "+original);
        System.out.println("Reversed String using string Builder: "+reverse);
    }

    public static String reverseStringCharArray(String original){
        char[] array = original.toCharArray();
        int start = 0;
        int end = array.length-1;
        char temp;

        while (start<end){
            temp = array[start];
            array[start]= array[end];
            array[end]=temp;
            start++;
            end--;
        }
        return new String(array);
    }
}
