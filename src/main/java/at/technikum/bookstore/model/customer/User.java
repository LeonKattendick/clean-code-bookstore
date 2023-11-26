package at.technikum.bookstore.model.customer;

import at.technikum.bookstore.model.book.Book;
import at.technikum.bookstore.model.order.BulkOrder;
import at.technikum.bookstore.model.order.Order;
import at.technikum.bookstore.model.order.SingleOrder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.util.Arrays;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class User extends Customer {

    private Book[] shoppingCart;

    @Override
    public Order createOrderForShoppingCart() {
        if (shoppingCart.length == 1) {
            return SingleOrder.builder()
                    .id(1)
                    .item(shoppingCart[0])
                    .price(shoppingCart[0].getPages() / 10)
                    .buyer(this)
                    .build();
        } else if (shoppingCart.length > 1) {
            return BulkOrder.builder()
                    .id(1)
                    .items(shoppingCart)
                    .price(Arrays.stream(shoppingCart).mapToInt(v -> v.getPages() / 10).sum())
                    .buyer(this)
                    .build();
        }
        return null;
    }
}
