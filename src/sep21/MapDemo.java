package sep21;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {

        Map<String,String> userDetail = new HashMap<>();
        userDetail.put("regi.mani@gmail.com","june@10");
        userDetail.put("peter.benju@gmail.com","june@11");
        userDetail.put("regi.mani@gmail.com","june@10");
        userDetail.putIfAbsent("liya@yahoo.com","sep@12");

       // System.out.println(userDetail.size());
       String password = userDetail.get("peter.benju@gmail.com");
       // System.out.println(password);

       Set<Map.Entry<String,String>> entrySet =userDetail.entrySet();

        for (Map.Entry<String,String> entry: entrySet){

            //userDetail.put(entry.getKey(),"password123");
            String oldValue = entry.setValue("password123");
            String key = entry.getKey();
            String newValue = entry.getValue();

            System.out.println("Email: "+key+"\nPassword: "+oldValue);
            System.out.println();
            System.out.println("Email: "+key+"\nPassword: "+newValue);
            System.out.println();

        }
        System.out.println();
        System.out.println("Before Delete: "+userDetail);
        userDetail.clear();
        System.out.println("After Delete: "+userDetail);
    }
}
