import java.util.ArrayList;
import java.util.List;

public class OrderHistory {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void displayOrderHistory() {
        System.out.println("=== Order History ===");
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }
}