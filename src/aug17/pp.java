package aug17;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

public class pp {

    public static void main(String[] args) {

        String original = "abcdes";
        //System.out.println(countTOChar(original));
        //String output = countTOChar(original);
        //System.out.println(output);
        isDuplicate(original);

    }

    public static void isDuplicate(String str) {

        String s = str.toLowerCase(Locale.ROOT);
        char[] chars = s.toCharArray();
        boolean isNotDuplicate = false;

        for (int i=0;i<s.length();i++){
            boolean isDuplicate = false;

            for(int j=i+1;j<s.length();j++){
                if (chars[i]==chars[j]){
                    isDuplicate = true;
                }
            }
            if(isDuplicate){
                System.out.print(chars[i]);
                isNotDuplicate = true;
            }
        }if(!isNotDuplicate){
            System.out.println("No duplicate found");
        }


    }
}
