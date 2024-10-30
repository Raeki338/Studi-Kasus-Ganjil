//statis
public class Restoran{
    public static void main(String[] args) {
        // Membuat beberapa menu makanan dan minuman
        Menu menu1 = new Menu("Nasi Goreng", 25000);
        Menu menu2 = new Menu("Es Teh Manis", 5000);

        // Membuat pelanggan
        Customer customer = new Customer("Budi", "budi@contoh.com");

        // Membuat pesanan dine-in
        DineInOrder dineInOrder = new DineInOrder(customer, menu1, 2); // Memesan 2 Nasi Goreng
        dineInOrder.calculateTotalPrice();
        dineInOrder.displayOrderDetails();

        // Membuat pesanan take-away
        TakeAwayOrder takeAwayOrder = new TakeAwayOrder(customer, menu2, 3); // Memesan 3 Es Teh Manis
        takeAwayOrder.calculateTotalPrice();
        takeAwayOrder.displayOrderDetails();
        
        // Mencatat riwayat pesanan
        OrderHistory history = new OrderHistory();
        history.addOrder(dineInOrder);
        history.addOrder(takeAwayOrder);
        history.displayOrderHistory();
    }
}
