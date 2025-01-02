package sep21;

import java.util.*;

class collectionsSet {
    public static void main(String[] args) {

        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Black");
        colors.add("Yellow");
        colors.add("White");
        colors.add("Blue");
        colors.add("Green");

        System.out.println(colors);

        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()){
            String temp = iterator.next();
            if (temp.equals("Yellow")) {
                iterator.remove();
                colors.add("Pink");
                break;
            }

        }

        System.out.println(colors);

        Set<String> sortedColors = new TreeSet<>();
        sortedColors.add("Red");
        sortedColors.add("Black");
        sortedColors.add("Gold");
        sortedColors.add("Orange");
        sortedColors.add("Blue");

        System.out.println(sortedColors);

        Set<String> colors2 = new LinkedHashSet<>();

        colors2.add("Red");
        colors2.add("Black");
        colors2.add("Gold");
        colors2.add("Orange");
        colors2.add("Blue");

        System.out.println(colors2);

    }




}
