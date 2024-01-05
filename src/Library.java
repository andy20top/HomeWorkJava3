import java.util.*;


public class Library implements Iterable<Book>{
    private List<Book> books = new ArrayList<>();

    Comparator<Book> authorComparable = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getAuthor().compareTo(o2.getAuthor());
        }
    };


    Comparator<Book> publishedYearComparator = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return Integer.compare(o1.getPublishedYear(), o2.getPublishedYear());
        }
    };

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void sortTitle() {
        Collections.sort(books);
    }

    public void sortAuthor() {
        Collections.sort(books, authorComparable);
    }

    public void sortPublishedYear() {
        Collections.sort(books, publishedYearComparator);
    }

    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
    }


}
