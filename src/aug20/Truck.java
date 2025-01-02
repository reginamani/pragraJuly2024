package aug20;

class Truck extends Vehicle{

    int loadCapacity;

    public Truck(String model,String color,int year){
        super(model, color, year);
    }

    public void printTruckDetails(int loadCapacity){
        System.out.println("Loadcapacity: "+loadCapacity);
    }
}
