package sep10;

class ProductDemo {

    String product;
    double price;

    public ProductDemo(String product, double price) {
        this.product = product;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return
                "product='" + product + '\'' +
                ", price=" + price
                ;
    }
}
