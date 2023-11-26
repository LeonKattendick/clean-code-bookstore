package at.technikum.bookstore;

import at.technikum.bookstore.model.book.Book;
import at.technikum.bookstore.model.book.Novel;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


class BookManagementTest {

    @Test
    void getInstance_returnsValidInstance() {
        assertNotNull(BookManagement.getInstance());
    }

    @Test
    void get_returnsCorrectBooks() {
        BookManagement.getInstance().add(novel());

        Optional<Book> book = BookManagement.getInstance().get(1);

        assertTrue(book.isPresent());
        assertEquals(1, book.get().getId());
    }

    @Test
    void remove_removesBook() {
        Book novel = novel();

        BookManagement.getInstance().add(novel);
        BookManagement.getInstance().remove(novel);

        Optional<Book> book = BookManagement.getInstance().get(1);

        assertTrue(book.isEmpty());
    }

    private Book novel() {
        return Novel.builder()
                .id(1)
                .name("Novel Book")
                .author("Cool Author")
                .pages(400)
                .genre("Science Fiction")
                .build();
    }
}
