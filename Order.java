public class Order {
    protected Customer customer;
    protected Menu menu;
    protected int quantity;
    protected double totalPrice;

    // Constructor
    public Order(Customer customer, Menu menu, int quantity) {
        this.customer = customer;
        this.menu = menu;
        this.quantity = quantity;
    }

    // Method untuk menghitung total harga
    public void calculateTotalPrice() {
        totalPrice = menu.getPrice() * quantity;
    }

    // Method untuk menampilkan detail pesanan
    public void displayOrderDetails() {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Menu: " + menu.getItemName());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: Rp" + totalPrice);
        System.out.println("Order Type: " + getOrderType());
        System.out.println("====================================");
    }

    // Method untuk menentukan tipe pesanan (di-override di kelas anak)
    public String getOrderType() {
        return "Generic Order";
    }
}