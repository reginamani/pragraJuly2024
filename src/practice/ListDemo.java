package practice;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

/*        List<String> list = new ArrayList<>();
        list.add("Regina");
        list.add("Mani");
        list.add("Vennila");

        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        System.out.println(list.contains("Liya"));
        System.out.println(list.contains("Mani"));

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Liya");
        map.put(2,"kavin");
        map.put(3,"Alwin");

        System.out.println(map);

        System.out.println(map.containsKey(4));
        System.out.println(map.containsValue("Liya"));*/

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(24);
        list.add(05);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
}
