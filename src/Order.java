import java.util.List;

public class Order {
    private String id;
    private List<OrderItem> items;
    private Customer customer;

    public Order(String id, List<OrderItem> items, Customer customer) {
        this.id = id;
        this.items = items;
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Customer getCustomer() {
        return customer;
    }
}
