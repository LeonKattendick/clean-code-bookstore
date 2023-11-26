package at.technikum.bookstore.model.customer;

import at.technikum.bookstore.model.book.Book;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class User extends Customer {

    private Book[] shoppingCart;

}
