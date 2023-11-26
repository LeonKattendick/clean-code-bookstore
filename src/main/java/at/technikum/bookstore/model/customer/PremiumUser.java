package at.technikum.bookstore.model.customer;

import at.technikum.bookstore.model.order.Order;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class PremiumUser extends User {

    private double priceReduction;

    @Override
    public Order createOrderForShoppingCart() {
        Order order = super.createOrderForShoppingCart();

        // Shop for free
        order.setPrice((int) (order.getPrice() * priceReduction));

        return order;
    }
}
