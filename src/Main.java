import java.util.*;

public class Main {
    public static void main(String[] args) {
        Library books = new Library();
        books.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        books.addBook(new Book("1984", "George Orwell", 1949));
        books.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1960));


        books.sortTitle();
        books.sortAuthor();
//        books.sortPublishedYear();

        Iterator<Book> item = books.iterator();

        while (item.hasNext()) {
            Book book = item.next();
            System.out.println(book);
        }
//        System.out.println(books.getBooks());

//        for (Book book : books) {
//            System.out.println(book);
//        }
    }
}