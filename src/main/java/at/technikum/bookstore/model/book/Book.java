package at.technikum.bookstore.model.book;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public abstract class Book {

    private int id;

    private String name;

    private String author;

    private int pages;

}
