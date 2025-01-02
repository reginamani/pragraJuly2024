package assignment;

import java.util.HashMap;
import java.util.Map;

public class PracticeProgram {

    public static void main(String[] args) {

        String input = "aabbbccccddee";

        Map<Character,Integer> countMap = new HashMap<>();

        for(char c:input.toCharArray()){
            countMap.put(c, countMap.getOrDefault(c,0)+1);
        }

        for (Map.Entry<Character,Integer> entry:countMap.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }


    }

}
