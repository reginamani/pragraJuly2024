package aug20;

class Bicycle extends Vehicle{

    int passengerCapacity;

    Bicycle(String model,String color,int year){
        super(model,color,year);
    }

    public void printBicycleDetails(int passengerCapacity){
        System.out.println("PassengerCapacity: "+passengerCapacity);
    }
}
