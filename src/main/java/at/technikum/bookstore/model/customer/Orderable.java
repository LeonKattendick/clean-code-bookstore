package at.technikum.bookstore.model.customer;

import at.technikum.bookstore.model.order.Order;

public interface Orderable {

    Order createOrderForShoppingCart();

}
