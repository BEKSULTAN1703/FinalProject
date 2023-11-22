package order;

import inventory.InventoryManager;
import model.InventoryItem;
import model.Order;
import model.Product;

import java.util.HashMap;
import java.util.Map;

public class OrderProcessor {
    private InventoryManager inventoryManager;

    public OrderProcessor() {
        // Get instance of InventoryManager (assuming Singleton usage)
        this.inventoryManager = InventoryManager.getInstance();
    }

    public void processOrder(Order order) {
        // Check availability of each product in the order in the inventory
        Map<Product, Integer> inventoryShortage = new HashMap<>();
        boolean isOrderFulfillable = true;

        for (Product product : order.getProducts()) {
            InventoryItem inventoryItem = inventoryManager.getInventoryItem(product.getId());
            if (inventoryItem == null || inventoryItem.getQuantity() <= 0) {
                inventoryShortage.put(product, inventoryItem != null ? inventoryItem.getQuantity() : 0);
                isOrderFulfillable = false;
            }
        }

        if (isOrderFulfillable) {
            // Update inventory and process the order
            for (Product product : order.getProducts()) {
                inventoryManager.decreaseProductQuantity(product.getId());
            }
            System.out.println("Order processed successfully.");
        } else {
            // Handle the case when products are out of stock
            System.out.println("Order cannot be fulfilled due to inventory shortage.");
            inventoryShortage.forEach((product, quantity) ->
                    System.out.println("Shortage: " + product.getName() + ", Quantity in Inventory: " + quantity));
        }
    }
}