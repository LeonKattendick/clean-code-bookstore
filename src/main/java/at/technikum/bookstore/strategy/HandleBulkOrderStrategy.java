package at.technikum.bookstore.strategy;

import at.technikum.bookstore.model.book.Book;
import at.technikum.bookstore.model.order.BulkOrder;
import at.technikum.bookstore.model.order.Order;

public class HandleBulkOrderStrategy implements HandleOrderStrategy {

    @Override
    public void handleOrder(Order order) {
        if (order instanceof BulkOrder bulkOrder) {
            System.out.println("Es wurden " + bulkOrder.getItems().length + " Bücher gekauft:");
            for (Book item : bulkOrder.getItems()) {
                System.out.println("Buch #" + item.getId() + " für " + order.getPrice());
            }
        }
    }
}
