package at.technikum.bookstore;

public class OrderManagement {

    private static OrderManagement instance;

    public static OrderManagement getInstance() {
        if (instance == null) {
            instance = new OrderManagement();
        }
        return instance;
    }
}
