package aug17;

import java.util.Locale;

public class VowelsCount {

    public static void main(String[] args) {

        String original ="Java Programming World";
        System.out.println(original);
        vowelsIn(original);


    }

    public static void vowelsIn(String str){
        int voowels = 0;
        int constants = 0;
        str.toLowerCase(Locale.ROOT);
        char[] chars= str.toCharArray();

        for (char c:chars){

            if("aeiouAEIOU".indexOf(c)!=-1){
                voowels++;
            }else if (Character.isLetter(c)){
                constants++;
            }
        }
        System.out.println("Vowels="+voowels);
        System.out.println("Constants="+constants);


    }
}
