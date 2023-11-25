package at.technikum.bookstore;

import at.technikum.bookstore.model.book.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookManagement {

    private static BookManagement instance;

    private final List<Book> books = new ArrayList<>();

    public Optional<Book> get(int id) {
        return books.stream().filter(v -> v.getId() == id).findFirst();
    }

    public void add(Book book) {
        books.add(book);
    }

    public void remove(Book book) {
        books.remove(book);
    }

    public static BookManagement getInstance() {
        if (instance == null) {
            instance = new BookManagement();
        }
        return instance;
    }
}
