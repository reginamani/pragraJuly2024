package practice;

class VehicelDemo {

    String model;
    int price;
}

class CarDemo{

    public static void main(String[] args) {

        VehicelDemo vehicel1 = new VehicelDemo();
        VehicelDemo vehicel2 = new VehicelDemo();

        System.out.println(vehicel1.toString());

        vehicel1.model="Tesla";
        vehicel1.price=50000;

        vehicel2.model="Tesla";
        vehicel2.price=50000;

        boolean result = vehicel1.equals(vehicel2);

        System.out.println(result);





    }
}

