package at.technikum.bookstore.model.order;

import at.technikum.bookstore.model.customer.Customer;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public abstract class Order {

    private int id;

    private int price;

    private Customer buyer;

}
