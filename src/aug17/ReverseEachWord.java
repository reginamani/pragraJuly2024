package aug17;

public class ReverseEachWord {
    public static void main(String[] args) {

        String original ="Hello world Java";
        System.out.println("original: "+original);
        String reversed = reverseEachword(original);
        System.out.println("Reversed word: "+reversed);
    }

    public static String reverseEachword(String str){
        String[] strings = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String s:strings){
            StringBuilder reversed = new StringBuilder(s).reverse();
            //String reversed = new StringBuilder(s).reverse().toString();
            result.append(reversed).append(" ");

        }
        return result.toString();
    }
}
