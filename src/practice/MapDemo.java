package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {

        Map<String,String> userDetails = new HashMap<>();
        userDetails.put("regi.mani@gmail.com","regi123");
        userDetails.put("peter@gmail.com","peter123");
        userDetails.put("liya@gmail.com","liya123");

        System.out.println(userDetails);

        Set<Map.Entry<String,String>> entrySet = userDetails.entrySet();

        for (Map.Entry<String,String> entry:entrySet){

            String oldvalue = entry.setValue("pw123");
            String key = entry.getKey();
            String newValue = entry.getValue();

            System.out.println("email:"+key+ " password:"+oldvalue);
            System.out.println();
            System.out.println("email:"+key+ " password:"+newValue);
            System.out.println();

        }

    }
}
