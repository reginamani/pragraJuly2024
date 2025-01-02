package assignment;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private int availableCopies;

    // Constructor

    public Book(String isbn, String title, String author, int availableCopies)
    {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }
    // Getters
    public String getIsbn() {
        return isbn;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getAvailableCopies() {
        return availableCopies;
    }
    // Setters
    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }
    // Override toString method for easy printing
    @Override

    public String toString() {
        return "Book{" + "ISBN='" + isbn + '\'' + ", " +
                "Title='" + title + '\'' +
                ", Author='" + author +
                '\'' + ", Available Copies=" + availableCopies + '}';
    }

}
