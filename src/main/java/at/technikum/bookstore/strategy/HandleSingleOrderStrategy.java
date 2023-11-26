package at.technikum.bookstore.strategy;

import at.technikum.bookstore.model.order.Order;
import at.technikum.bookstore.model.order.SingleOrder;

public class HandleSingleOrderStrategy implements HandleOrderStrategy {

    @Override
    public void handleOrder(Order order) {
        if (order instanceof SingleOrder singleOrder) {
            System.out.println("Nur ein Buch wurde gekauft:");
            System.out.println("Buch #" + singleOrder.getItem().getId() + " für " + order.getPrice());
        }
    }
}
