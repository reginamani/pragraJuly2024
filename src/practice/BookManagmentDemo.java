package practice;

public class BookManagmentDemo {

    BookSample[] bookSamples;
    int count1;

    public BookManagmentDemo(int capacity1) {
        bookSamples = new BookSample[capacity1];
        count1 =0;
    }

    public void addBook1(String isbn,String title,String author,int copies){
        if(count1< bookSamples.length)
        {
            bookSamples[count1] = new BookSample(isbn,title,author,copies);
            count1++;
        }else{
            System.out.println("Library is full, No space to add book");
        }

    }
    public void displayBookDetails1(int index){
        if(index > 0 && index < count1){
            System.out.println(bookSamples[index]);
        }
        else {
            System.out.println("Book not found");
        }
    }
}

class Test{
    public static void main(String[] args) {

        BookManagmentDemo bookManagmentDemo = new BookManagmentDemo(5);
        bookManagmentDemo.addBook1("101","Toy Story","Henry",2);
        bookManagmentDemo.addBook1("202","Twilight","Isabelle",2);

        bookManagmentDemo.displayBookDetails1(2);


    }
}


