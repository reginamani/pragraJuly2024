package aug6;

public class MainConstructor {

    public static void main(String[] args) {

        ConstructorDemo car = new ConstructorDemo();
        System.out.println(car.color+" "+car.type+" "+car.year);

        ConstructorDemo car1 = new ConstructorDemo("Tesla");
        System.out.println(car1.model);

        ConstructorDemo car2 = new ConstructorDemo("Toyota","Black");
        System.out.println(car2.model+" "+car2.color);

    }
}
