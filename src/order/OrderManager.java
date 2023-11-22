package order;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderManager {
    private List<Order> orders;

    public OrderManager() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrderById(String orderId) {
        for (Order order : orders) {
            if (order.getOrderId().equals(orderId)) {
                return order;
            }
        }
        return null;
    }

    public boolean orderExists(String orderId) {
        return orders.stream().anyMatch(order -> order.getOrderId().equals(orderId));
    }

    public boolean removeOrder(String orderId) {
        return orders.removeIf(order -> order.getOrderId().equals(orderId));
    }

    public List<Order> getAllOrders() {
        return new ArrayList<>(orders);
    }
}
