package aug17;

import java.util.HashSet;

public class FindLongest {

    public static void main(String[] args) {

        String s1 ="aabbccddeeff";
        String s2 ="bbbb";
        String s3 ="pwkwe";
        String s4 ="";
       System.out.println(findLongestest(s1));

    }


    public static int findLongestest(String str){

        HashSet<Character> alpha = new HashSet<>();
        int maxLength = 0;
        int end = 0;

        for (int start=0; start<str.length();start++){
            while (alpha.contains(str.charAt(start))){
                alpha.remove(str.charAt(end));
                end++;
            }
            alpha.add(str.charAt(start));
            maxLength = Math.max(maxLength,start-end+1);

        }
        return maxLength;


    }
}
