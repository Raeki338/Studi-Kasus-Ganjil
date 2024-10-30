public class DineInOrder extends Order {
    public DineInOrder(Customer customer, Menu menu, int quantity) {
        super(customer, menu, quantity);
    }

    // Override method getOrderType
    @Override
    public String getOrderType() {
        return "Dine-In";
    }
}