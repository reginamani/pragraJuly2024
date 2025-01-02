package sep21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class compareHashMap {

    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"A");
        map1.put(2,"B");
        map1.put(3,"C");

        Map<Integer,String> map2 = new HashMap<>();
        map2.put(3,"C");
        map2.put(2,"B");
        map2.put(1,"A");

        Map<Integer,String> map3 = new HashMap<>();
        map3.put(1,"A");
        map3.put(2,"B");
        map3.put(3,"C");
        map3.put(4,"C");

        Map<Integer,String> map4 = new HashMap<>();
        map4.put(1,"A");
        map4.put(2,"B");
        map4.put(3,"C");
        map4.put(4,"D");

        //on basis of Key-value use equals method
        System.out.println(map1.equals(map2));
        System.out.println(map1.equals(map3));

        //Compare Hashmap keySet
        System.out.println(map1.keySet().equals(map2.keySet()));
        System.out.println(map1.keySet().equals(map3.keySet()));

        //Find extra key in hashmap
        HashSet<Integer> combineKeys = new HashSet<>(map1.keySet());
        combineKeys.addAll(map4.keySet());
        combineKeys.removeAll(map1.keySet());
        System.out.println(combineKeys);

        //compare by value
        System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map2.values())));
        System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map3.values())));

        System.out.println(new HashSet<>(map1.values()).equals(new HashSet<>(map3.values())));

    }
}
