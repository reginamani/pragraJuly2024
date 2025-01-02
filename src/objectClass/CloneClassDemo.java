package objectClass;

public class CloneClassDemo {

    public static void main(String[] args) throws CloneNotSupportedException {

        Book obj1 = new Book("Toy Stories","1000");
        System.out.println("Original Book");
        System.out.println("*************");
        System.out.println("BookName: "+obj1.getBookName());
        System.out.println("isbnNo: "+obj1.getIsbn());

        Book clonedObj = (Book)obj1.clone();
        System.out.println();
        System.out.println("Cloned Book");
        System.out.println("*************");
        System.out.println("BookName: "+clonedObj.getBookName());
        System.out.println("isbnNo: "+clonedObj.getIsbn());
    }
}
