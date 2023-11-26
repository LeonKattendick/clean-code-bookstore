package at.technikum.bookstore;

import at.technikum.bookstore.model.book.Book;
import at.technikum.bookstore.model.book.Novel;
import at.technikum.bookstore.model.customer.User;
import at.technikum.bookstore.model.order.BulkOrder;
import at.technikum.bookstore.model.order.SingleOrder;
import at.technikum.bookstore.strategy.HandleBulkOrderStrategy;
import at.technikum.bookstore.strategy.HandleOrderStrategy;
import at.technikum.bookstore.strategy.HandleSingleOrderStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderManagementTest {

    @Test
    void getInstance_returnsValidInstance() {
        assertNotNull(OrderManagement.getInstance());
    }

    @Test
    void getStrategy_returnsCorrectStrategy_forSingleOrder() {
        HandleOrderStrategy strategy = OrderManagement.getInstance().getStrategy(singleOrder());
        assertInstanceOf(HandleSingleOrderStrategy.class, strategy);
    }

    @Test
    void getStrategy_returnsCorrectStrategy_forBulkOrder() {
        HandleOrderStrategy strategy = OrderManagement.getInstance().getStrategy(bulkOrder());
        assertInstanceOf(HandleBulkOrderStrategy.class, strategy);
    }

    @Test
    void handleOrder_works_forSingleOrder() {
        assertDoesNotThrow(() -> OrderManagement.getInstance().handleOrder(singleOrder()));
    }

    @Test
    void handleOrder_works_forBulkOrder() {
        assertDoesNotThrow(() -> OrderManagement.getInstance().handleOrder(bulkOrder()));
    }


    @Test
    void handleOrder_fails_forNullOrder() {
        assertThrows(RuntimeException.class, () -> OrderManagement.getInstance().handleOrder(null));
    }

    private SingleOrder singleOrder() {
        return SingleOrder.builder()
                .id(1)
                .price(100)
                .buyer(
                        User.builder()
                                .id(1)
                                .name("Max")
                                .shoppingCart(new Book[0])
                                .build()
                )
                .item(novel(1))
                .build();
    }


    private BulkOrder bulkOrder() {
        return BulkOrder.builder()
                .id(1)
                .price(100)
                .buyer(
                        User.builder()
                                .id(1)
                                .name("Max")
                                .shoppingCart(new Book[0])
                                .build()
                )
                .items(new Book[]{novel(1), novel(2)})
                .build();
    }

    private Book novel(int id) {
        return Novel.builder()
                .id(id)
                .name("Novel Book")
                .author("Cool Author")
                .pages(400)
                .genre("Science Fiction")
                .build();
    }
}
