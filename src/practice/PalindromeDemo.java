package practice;

import java.util.Locale;

public class PalindromeDemo {

    public static void main(String[] args) {

        String original = "dot saw I was tod";
        String notPalnid = "pragra";

        boolean result1 = isPalindrome(original);
        boolean result2 = isPalindrome(notPalnid);

        System.out.println(original+" is palindrome? "+result1);
        System.out.println(notPalnid+" is palindrome? "+result2);

    }

    public static boolean isPalindrome(String str){

        str = str.replaceAll("\\s+","").toLowerCase(Locale.ROOT);
        boolean result = true;
        int length = str.length();

        for (int i=0; i<length/2; i++){
            if(str.charAt(i) != str.charAt(length-i-1) ){
                return false;
            }
        }
        return result;
    }
}
