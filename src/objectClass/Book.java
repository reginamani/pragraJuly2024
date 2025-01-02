package objectClass;

public class Book implements Cloneable{
    private String bookName;
    private String isbn;

    public Book(String bookName, String isbn) {
        super();
        this.bookName = bookName;
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
