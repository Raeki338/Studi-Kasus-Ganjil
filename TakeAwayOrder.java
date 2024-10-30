public class TakeAwayOrder extends Order {
    public TakeAwayOrder(Customer customer, Menu menu, int quantity) {
        super(customer, menu, quantity);
    }

    // Override method getOrderType
    @Override
    public String getOrderType() {
        return "Take-Away";
    }
}