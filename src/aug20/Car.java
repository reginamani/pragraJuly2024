package aug20;

class Car extends Vehicle{
      int year;

   public Car(String model,String color,int year){
        super(model,color,year);
    }

    public void printCarDetails(String brand){
        System.out.println("Brand: "+brand);
    }

}
