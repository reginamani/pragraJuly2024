package aug17;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupliArray {

    public static void main(String[] args) {

        int[] arr = {5,2,3,4,5,1,2};

        int[] unique = removeDuplicate(arr);

        for (int num:unique){
            System.out.print(num+",");
        }

    }

    public static int[] removeDuplicate(int[] arr){
        Set<Integer> set = new HashSet<>();

        for(int num:arr){
            set.add(num);
        }

        int[] result = new int[set.size()];
        int i = 0;
        for (int num:set){
            result[i++] = num;
        }
        return result;
    }
}
