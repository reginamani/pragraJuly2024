package aug10;

public class DemoStatic {

    static int x= 10;

    public static void change()
    {
        int x =20;

    }

    public static void main(String[] args) {
        DemoStatic d1 = new DemoStatic();
        d1.change();
        System.out.println(d1.x);
    }

}
