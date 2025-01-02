package objectClass;

import java.util.Objects;

class Laptop {

    String model;
    double price;
    String serialNo;

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", serialNo='" + serialNo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.price, price) == 0 && Objects.equals(model, laptop.model);
    }

   @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }


}

class Product{
    public static void main(String[] args) {


        Laptop obj1 = new Laptop();
        Laptop obj2 = new Laptop();
        Laptop obj3 = new Laptop();

        obj1.model = "Dell";
        obj1.price = 3000;
        obj1.serialNo = "SN787676jb";

        obj2.model = "Dell";
        obj2.price = 3000;
        obj2.serialNo = "iubmnb2387e8";

        obj3.model = "Dell";
        obj3.price = 3000;

        System.out.println(obj1);
        System.out.println(obj2);

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());

        boolean result = obj1.equals(obj2);
        System.out.println(result);

        Class<?> clazz = obj1.getClass();

        System.out.println(obj1.getClass());
        System.out.println(clazz.getName());



    }
}
