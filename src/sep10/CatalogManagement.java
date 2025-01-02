package sep10;

class CatalogManagement {

    ProductCatalog[] productCatalogs;
    private int count;

    public CatalogManagement() {
        productCatalogs = new ProductCatalog[3];
        count=0;
    }

    public void addProduct(ProductCatalog productCatalog){
        if(count< productCatalogs.length){
            productCatalogs[count]=productCatalog;
            count++;
        }else {
            System.out.println("no more space");
        }
    }

    /*public String findProduct(String product){
        for(int i=0; i<productCatalogs.length;i++){
            if(productCatalogs[i].getProduct().equalsIgnoreCase(product)){
                return productCatalogs[i].getProduct();
            }
        }throw new ProductNotFoundException("Product "+product+" not found");
    }*/

    public ProductCatalog findProduct(String product){
        for (ProductCatalog product1: productCatalogs){
            if(product1.getProduct().equalsIgnoreCase(product)) {
                return product1;
            }
        }throw new ProductNotFoundException("Product "+product+ " not found");
    }

    public double getPrice(String product){
        for(int i=0; i<productCatalogs.length; i++){
            if(productCatalogs[i].getProduct().equalsIgnoreCase(product)){
                return productCatalogs[i].getPrice();
            }
        }
        throw new ProductNotFoundException("Product " +product+ " not found");
    }

    public void addTocart(String productName){
        try {
           ProductCatalog catalog = findProduct(productName);
           double price = getPrice(productName);
            System.out.println("Product " + productName + " added to your cart" + "\namount is "+price);
        }catch (ProductNotFoundException e){
            System.out.println(e.getMessage());
        }
    }


    public void listProduct(){
        for(ProductCatalog prod: productCatalogs){
            System.out.println(prod);
        }
    }

    public static void main(String[] args) {

        CatalogManagement catalogManagement = new CatalogManagement();
        ProductCatalog productCatalog1 = new ProductCatalog("Laptop",3000);
        ProductCatalog productCatalog2 = new ProductCatalog("Mobile",1000);
        ProductCatalog productCatalog3 = new ProductCatalog("Headphone",100);
        ProductCatalog productCatalog4 = new ProductCatalog("Charger",50);

        catalogManagement.addProduct(productCatalog1);
        catalogManagement.addProduct(productCatalog2);
        catalogManagement.addProduct(productCatalog3);
        catalogManagement.listProduct();

            double productPrice = catalogManagement.getPrice("Laptop");
            System.out.println("The price of "+ productPrice);
            ProductCatalog name = catalogManagement.findProduct("Laptop");
            System.out.println(name);
           catalogManagement.addTocart("Laptop");
        catalogManagement.addTocart("Screen");
        //catalogManagement.addTocart("Screen");
            //System.out.println(catalogManagement.getPrice("screen"));





    }
}
