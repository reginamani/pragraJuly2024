package aug17;

import java.util.Locale;

public class FindDuplicateString {

    public static void main(String[] args) {

       String str = "hackerearth";
        isDuplicate(str);
    /*    System.out.println();
        String str1 ="abcde";
        isDuplicate(str1);*/

    }

    public static void isDuplicate(String str){

        String s = str.toLowerCase(Locale.ROOT);
        char[] chars = s.toCharArray();

        boolean isNotDuplicate = false;

        for (int i=0; i<s.length();i++){
            boolean isDuplicate = false;

            for (int j =i+1; j<s.length();j++ ){
                if(chars[i]==chars[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate){
                System.out.print(chars[i]);
                isNotDuplicate = true;
            }

        }if(!isNotDuplicate){
            System.out.println("No duplicates found");
        }

    }
}
