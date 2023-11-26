package at.technikum.bookstore.model.order;

import at.technikum.bookstore.model.book.Book;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class BulkOrder extends Order {

    private Book[] items;

}
