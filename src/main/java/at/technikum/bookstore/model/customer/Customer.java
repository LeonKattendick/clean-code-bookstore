package at.technikum.bookstore.model.customer;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public abstract class Customer {

    private int id;

    private String name;

}
