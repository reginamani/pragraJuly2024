package sep3;

abstract class SmartPhone {

 String model;
 String brand;


 SmartPhone(String model, String brand) {
  this.model = model;
  this.brand = brand;
 }

 abstract void makeCall(String phoneNo);

 void displayInfo(){
  System.out.println("Brand: " +brand + "\nModel: "+model);
 }
}
