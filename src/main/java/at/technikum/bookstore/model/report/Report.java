package at.technikum.bookstore.model.report;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public abstract class Report {

    private String information;

}
