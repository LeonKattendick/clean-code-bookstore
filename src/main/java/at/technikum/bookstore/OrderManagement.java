package at.technikum.bookstore;

import at.technikum.bookstore.model.order.BulkOrder;
import at.technikum.bookstore.model.order.Order;
import at.technikum.bookstore.model.order.SingleOrder;
import at.technikum.bookstore.strategy.HandleBulkOrderStrategy;
import at.technikum.bookstore.strategy.HandleOrderStrategy;
import at.technikum.bookstore.strategy.HandleSingleOrderStrategy;

public class OrderManagement {

    private static OrderManagement instance;

    public void handleOrder(Order order) {

        HandleOrderStrategy orderStrategy = getStrategy(order);

        if (orderStrategy == null) {
            throw new RuntimeException("Unknown order type");
        }

        orderStrategy.handleOrder(order);
    }

    public HandleOrderStrategy getStrategy(Order order) {
        if (order instanceof SingleOrder) {
            return new HandleSingleOrderStrategy();
        } else if (order instanceof BulkOrder) {
            return new HandleBulkOrderStrategy();
        }
        return null;
    }

    public static OrderManagement getInstance() {
        if (instance == null) {
            instance = new OrderManagement();
        }
        return instance;
    }
}
