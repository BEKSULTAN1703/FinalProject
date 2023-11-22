package model;

public class InventoryItem {
    private Product product;
    private int quantity;

    public InventoryItem(Product product, int quantity) {
        setProduct(product);
        setQuantity(quantity);
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }
        this.product = product;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "InventoryItem{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
