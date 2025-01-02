package sep14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class collectionsDemo {
    public static void main(String[] args) {

        List<String> petrolCars = new ArrayList<>();
        petrolCars.add("Mazda");
        petrolCars.add("BMW X6");
        petrolCars.add("Audi");
        petrolCars.add("Toyota Aygo");
        petrolCars.add("Audi");
        System.out.println(petrolCars);
        petrolCars.remove(2);
        petrolCars.add(3,"Audi 2");
        System.out.println(""+petrolCars.contains("BMW X6"));
        System.out.println(petrolCars);


        List<String> electricCars = new LinkedList<>();
        electricCars.add("Tesla");
        electricCars.add("Rivian");
        electricCars.add("Fisker");
        electricCars.add("Audi e-Tron");
        System.out.println(electricCars);


        List<String> cars = new ArrayList<>();
        cars.addAll(petrolCars);
        cars.addAll(electricCars);
        System.out.println(cars);

        for (int i=0; i<cars.size(); i++){
            if(cars.get(i).equalsIgnoreCase("BMW X6")){
                cars.remove(i);
                //break;
            }
        }
        System.out.println("Updated cars "+cars);

    }

}
