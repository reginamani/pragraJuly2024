package aug17;

import java.util.HashSet;

public class RemoveDuplicate {

    public static void main(String[] args) {

        String original ="hackerearth";
        System.out.println("Original:" +original);
        String output = removeDuplicate(original);
        System.out.println("removing Duplicate: "+output);


    }

    public static String removeDuplicate(String str){

        HashSet<Character> seen = new HashSet<>();
        char[] chars = str.toCharArray();
        StringBuilder result = new StringBuilder();

        for (char c:chars){
            if(!seen.contains(c)){
                seen.add(c);
                result.append(c).append(" ");
            }
        }
        return result.toString();
    }
}
