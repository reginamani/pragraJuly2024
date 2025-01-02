package practice;

public class BookSample {

    private String isbn1;
    private String title1;
    private String author1;
    private int availableCopies1;

    public BookSample(String isbn1, String title1, String author1, int availableCopies1) {
        this.isbn1 = isbn1;
        this.title1 = title1;
        this.author1 = author1;
        this.availableCopies1 = availableCopies1;
    }

    public String getIsbn1() {
        return isbn1;
    }

    public String getTitle1() {
        return title1;
    }

    public String getAuthor1() {
        return author1;
    }

    public int getAvailableCopies1() {
        return availableCopies1;
    }

    public void setAvailableCopies1(int availableCopies1) {
        this.availableCopies1 = availableCopies1;
    }

    @Override
    public String toString() {
        return "BookSample{" +
                "isbn1='" + isbn1 + '\'' +
                ", title1='" + title1 + '\'' +
                ", author1='" + author1 + '\'' +
                ", availableCopies1=" + availableCopies1 +
                '}';
    }
}
