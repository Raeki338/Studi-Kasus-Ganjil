public class Menu {
    private String itemName;
    private double price;

    // Constructor Overloading
    public Menu() {
        this.itemName = "Unknown";
        this.price = 0.0;
    }

    public Menu(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    // Getter dan Setter
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}