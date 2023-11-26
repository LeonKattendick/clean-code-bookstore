package at.technikum.bookstore.strategy;

import at.technikum.bookstore.model.order.Order;

public interface HandleOrderStrategy {

    void handleOrder(Order order);

}
