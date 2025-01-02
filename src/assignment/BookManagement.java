package assignment;

public class BookManagement {

    private Book[] books;
    private int count; // to keep track of the number of books added

    // Constructor
    public BookManagement(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    // Adds a book to the library
    public void addBook(String isbn, String title, String author, int copies) {
        if (count < books.length) {
            books[count] = new Book(isbn, title, author, copies);
            count++;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Finds a book by its ISBN and returns its index in the array, or -1 if not found
    public int findBookByISBN(String isbn) {
        for (int i = 0; i < count; i++)
        {
            if (books[i].getIsbn().equals(isbn)) {
                return i;
            }
        } return -1; // return -1 if the book is not found
        }

        // Decrements the available copies of a book at the given index
    public boolean checkOutBook(int bookIndex) {
        if (bookIndex >= 0 && bookIndex < count)
        {
            Book book = books[bookIndex];
            if (book.getAvailableCopies() > 0) {
                book.setAvailableCopies(book.getAvailableCopies() - 1);
                return true;
            }
        }return false; // return false if the book cannot be checked out
    }

    // Increments the available copies of a book at the given index
    public boolean checkInBook(int bookIndex) {
    if (bookIndex >= 0 && bookIndex < count)
    { Book book = books[bookIndex];
        book.setAvailableCopies(book.getAvailableCopies() + 1);
        return true;
    } return false; // return false if the book cannot be checked in
        }

        // Prints the details of the book at the given index
    public void displayBookDetails(int bookIndex) {
    if (bookIndex >= 0 && bookIndex < count)
    {
        System.out.println(books[bookIndex]);
    } else {
        System.out.println("Book not found.");
    }
}

// Main method for testing
public static void main(String[] args){

    BookManagement library = new BookManagement(10);    // Library with capacity for 10 books

    // Adding books
    library.addBook("1234567890", "Book One", "Author One", 5);
    library.addBook("0987654321", "Book Two", "Author Two", 3);

    // Find book by ISBN
        int index = library.findBookByISBN("1234567890");
        System.out.println("Index of book with ISBN 1234567890: " + index);
        // Display book details
        library.displayBookDetails(index);

        // Checkout a book
        boolean checkoutSuccess = library.checkOutBook(index);
        System.out.println("Checkout successful: " + checkoutSuccess);
        // Display book details again to see the change in available copies
        library.displayBookDetails(index);

        // Check in the book
        boolean checkinSuccess = library.checkInBook(index);
        System.out.println("Check-in successful: " + checkinSuccess);
        // Display book details again to see the change in available copies
        library.displayBookDetails(index);
    }
}
