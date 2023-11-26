package at.technikum.bookstore.model.customer;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class Administrator  extends Customer{

    private int permissionLevel;

}
