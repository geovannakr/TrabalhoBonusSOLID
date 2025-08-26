public class PricingService {
    public double calculateTotal(Order order) {
        double total = 0;
        for (OrderItem item : order.getItems()) {
            total += item.getPrice() * item.getQuantity();
        }

        if (order.getCustomer().isStudent()) {
            total *= 0.95;
        }

        return total;
    }
}