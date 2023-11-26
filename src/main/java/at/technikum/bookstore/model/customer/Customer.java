package at.technikum.bookstore.model.customer;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public abstract class Customer implements Orderable {

    private int id;

    private String name;

}
