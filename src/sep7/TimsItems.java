package sep7;

abstract class TimsItems {


    private String item;
    private double price;

    public TimsItems(String item,double price) {
        this.item = item;
        this.price = price;
    }

    public String getItem(){
        return item;
    }

    public double getPrice() {
        return price;
    }

    public abstract String toString();
}
