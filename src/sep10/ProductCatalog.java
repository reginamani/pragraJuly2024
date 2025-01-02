package sep10;

class ProductCatalog {

   private String product;
   private double price;

    public ProductCatalog(String product, double price) {
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
        return "ProductCatalog{" +
                "product='" + product + '\'' +
                ", price=" + price +
                '}';
    }
}
