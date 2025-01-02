package assignment;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ReverseString {

    public static void main(String[] args) {

        String name1 = "Regina";
        String name2 = "Mani";

        name1 = name1+name2;
        System.out.println(name1);

        name2 = name1.substring(0,name1.length()-name2.length());
        System.out.println(name2);
        
        name1 = name1.substring(name2.length());
        System.out.println(name1);


}





}
