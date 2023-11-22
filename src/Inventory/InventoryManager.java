package inventory;

import model.InventoryItem;
import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private static InventoryManager instance;
    private Map<String, InventoryItem> inventory;

    private InventoryManager() {
        this.inventory = new HashMap<>();
    }

    public static synchronized InventoryManager getInstance() {
        if (instance == null) {
            instance = new InventoryManager();
        }
        return instance;
    }

    public void addProduct(InventoryItem item) {
        inventory.put(item.getProduct().getId(), item);
    }

}