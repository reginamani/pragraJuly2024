package aug17;

import java.util.*;

public class Sample1 {
    public static void main(String args[]) {

        int[] arr = {5,2,3,4,5,1,2};

        int[] unique = removeDuplicate(arr);

        for (int num:unique){
            System.out.print(num+",");
        }
    }

    public static int[] removeDuplicate(int[] array) {

        Set<Integer> set = new HashSet<>();

        for (int num:array){
            if (!set.contains(num)){
                set.add(num);
            }
        }

        int[] unique = new int[set.size()];
        int i=0;
        for (int num:set){
            unique[i++] = num;
        }

        return unique;
           }

}
