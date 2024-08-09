package aug6;

public class ConstructorDemo {

    String model;
    String color;
    int year;
    String type;

    ConstructorDemo(){
        model= "Maruthi";
        color = "Blue";
        year = 2022;
        type = "SUV";
    }

    ConstructorDemo(String model){
        this.model= model;
    }

    ConstructorDemo(String model, String color){
        this.model = model;
        this.color = color;

    }

    ConstructorDemo(String model, String color, int year){
        this.model = model;
        this.color = color;
        this.year = year;

    }

    ConstructorDemo(String model, String color, int year, String type){
        this.model = model;
        this.color = color;
        this.year = year;
        this.type = type;

    }

}
