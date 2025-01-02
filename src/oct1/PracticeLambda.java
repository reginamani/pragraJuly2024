package oct1;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class PracticeLambda {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("AX");
        names.add("BBX");
        names.add("XCCCX");
        names.add("xabcx");

        System.out.println(names);

        PracticeLambda pl = new PracticeLambda();
        System.out.println(pl.addStar(names));
    }

    public List<String> addStar(List<String> strings) {

        strings.replaceAll(n -> n.replaceAll("(?i)x",""));
        return strings;

      /*  strings.replaceAll(n -> n.toLowerCase(Locale.ROOT));
        return strings;*/

        //List<String> modifiedString = strings.stream().map(n -> "y"+n+"y").collect(Collectors.toList());
        //return modifiedString;

    }

    public String makeOutWord(String out, String word) {
        String result = out.substring(0,1)+word+out.substring(2,3);
        return result;
    }
}
