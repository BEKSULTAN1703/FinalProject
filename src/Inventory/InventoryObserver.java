package model;

public class InventoryItem {
    private Product product;
    private int quantity;

    // Constructor
    public InventoryItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    // Getters and Setters
    public Product getProduct() { return product; }
    public int getQuantity() { return quantity; }
    public void setProduct(Product product) { this.product = product; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}