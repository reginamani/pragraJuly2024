package aug17;

import java.util.*;

public class CommanInArray {
    public static void main(String[] args) {

       int[] array1 = {1,2,3,4,5};
       int[] array2 = {5,6,7,8,1};

       Set<Integer> commanSet = commanElement(array1,array2);
        System.out.println(commanSet);


    }

    public static Set<Integer> commanElement(int[] arr1,int[] arr2){

        Set<Integer> set = new HashSet<>();
        Set<Integer> commanSet = new HashSet<>();

        for(int num:arr1){
            set.add(num);
       }
        for (int num:arr2){
            if(set.contains(num)){
                commanSet.add(num);
            }
        }
       return commanSet;
  }

     }


