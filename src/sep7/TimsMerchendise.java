package sep7;

class TimsMerchendise extends TimsItems {

    private String feature;

    public TimsMerchendise(String item,double price, String feature) {
        super(item,price);
        this.feature = feature;
    }

    public String getFeature() {
        return feature;
    }

    @Override
    public String toString() {
        return "Item: "+getItem()+
                "\nFeature: "+getFeature()+
                "\nPrice: $"+getPrice();
    }
}
