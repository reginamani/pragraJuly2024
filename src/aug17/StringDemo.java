package aug17;

public class StringDemo {

    public static void main(String[] args) {

        String s1 = "Pragara";
        String s2 = new String("Pragara");
        String s3 = s1.concat("Incorporate");
        String s4 = "  p r a g a r a ";
        String s5 = "Pragara";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s4);
        System.out.println(s4.trim());
        System.out.println(s1==s5);

        //char ch = s4.charAt(3);
        System.out.println("the char is: "+s4.charAt(2));
        //System.out.println(s4.c);
    }
}
