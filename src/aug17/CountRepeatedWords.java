package aug17;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CountRepeatedWords {

    public static void main(String[] args) {

        String str = "test automation java automation";
        countWord(str);


    }

    public static void countWord(String str){

        String[] words = str.toLowerCase(Locale.ROOT).split("\\s+");

        Map<String,Integer> countMap = new HashMap<>();

        for (String word:words){
            countMap.put(word,countMap.getOrDefault(word,0)+1);
        }

        for (Map.Entry<String,Integer> entry : countMap.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }


    }




}
