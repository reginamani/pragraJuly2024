package sep7;

class TimsConsumable extends TimsItems{

    private int calories;

    public TimsConsumable(String item,double price, int calories) {
        super(item,price);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Item: "+getItem()+
                "\nCalories: "+getCalories()+
                "\nPrice: $"+getPrice();
    }
}
