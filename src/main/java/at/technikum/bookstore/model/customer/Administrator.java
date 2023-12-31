package at.technikum.bookstore.model.customer;

import at.technikum.bookstore.model.order.Order;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class Administrator extends User {

    private int permissionLevel;

    @Override
    public Order createOrderForShoppingCart() {
        Order order = super.createOrderForShoppingCart();

        // Shop for free
        order.setPrice(0);

        return order;
    }
}
