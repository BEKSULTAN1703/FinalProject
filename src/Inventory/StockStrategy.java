package inventory;

public interface StockStrategy {
    void applyStrategy(InventoryItem item);
}

public class FifoStockStrategy implements StockStrategy {
    public void applyStrategy(InventoryItem item) {

    }
}

public class LifoStockStrategy implements StockStrategy {
    public void applyStrategy(InventoryItem item) {

    }
}