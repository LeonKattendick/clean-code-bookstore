package at.technikum.bookstore.model.report;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class OrderReport extends Report {

    private int averageOrders;

}
