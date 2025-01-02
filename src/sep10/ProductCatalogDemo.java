package sep10;

class ProductCatalogDemo {

    ProductDemo[] product;
    int count;

    public ProductCatalogDemo(){
        product = new ProductDemo[3];
        count = 0;
    }

    public void addProduct(ProductDemo productDemo){
        if(count<product.length){
            product[count] = productDemo;
            count++;
        }else {
            System.out.println("Out of space");
        }
    }

    public ProductDemo findProduct(String product1){
        for(ProductDemo productDemo : product){
            if(productDemo.getProduct().equalsIgnoreCase(product1)){
                return productDemo;
            }
        }throw new ProductNotFoundException("Product "+product1+ " is not found");
    }

    public void addToCart(String product1){
        try {
            ProductDemo productDemo = findProduct(product1);
            double price = productDemo.getPrice();
            System.out.println("Product "+product1+ " is added to cart"+ "\n Price: "+price);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public void listAllProduct(){
        for (ProductDemo productDemo : product){
            System.out.println(productDemo);
        }
    }

    public static void main(String[] args) {

        ProductCatalogDemo productCatalog = new ProductCatalogDemo();

        ProductDemo prod1 = new ProductDemo("Phone",1000);
        ProductDemo prod2 = new ProductDemo("Laptop",3000);
        ProductDemo prod3 = new ProductDemo("HeadPhone",100);

        productCatalog.addProduct(prod1);
        productCatalog.addProduct(prod2);
        productCatalog.addProduct(prod3);
        productCatalog.listAllProduct();

        productCatalog.addToCart("laptop");
        productCatalog.addToCart("phone");
        productCatalog.addToCart("Mouse");

    }
}
