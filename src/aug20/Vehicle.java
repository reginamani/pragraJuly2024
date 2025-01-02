package aug20;

public class Vehicle {

    String model;
    String color;
    int year;

    public Vehicle(String model,String color,int year){
        this.model = model;
        this.color=color;
        this.year=year;
    }

    public void printDetails(){
        System.out.println("Model: "+model+"\nColor: "+color+"\nYear: "+year);
    }
}

class Main4 {

    public static void main(String[] args) {
        Car car = new Car("Toyota","black",2022);
        car.printDetails();
        System.out.println();

        Bicycle bicycle = new Bicycle("Ladybird","pink",2015);
        bicycle.printDetails();
        System.out.println();

        Truck truck = new Truck("Mahindra","White",2000);
        truck.printDetails();
        System.out.println();

        car.printCarDetails("Toyota");
        bicycle.printBicycleDetails(2);
        truck.printTruckDetails(1000);


    }
}
