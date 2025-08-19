import java.util.List;
import java.util.List;

class Book {
    String title;
    Book(String title) {
        this.title = title;
    }
    void show() {
        System.out.println("Book: " + title);
    }
}
class Library {
    //Aggregation: Library "has-a" list of books
    List<Book> books;
    Library(List<Book> books) {
        this.books = books;
    }
    void showBooks() {
        for(Book book: books) {
            book.show();
        }
    }
}
public class Aggregation {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming");
        Book b2 = new Book("Data Structures");

        List<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);

        //Library is created with Books
        Library library = new Library(bookList);
        library.showBooks();
    }
}
