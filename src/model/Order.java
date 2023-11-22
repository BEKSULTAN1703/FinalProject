package order;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderManager {
    private List<Order> orders;

    public OrderManager() {
        this.orders = new ArrayList<>();
    }

    // Добавление нового заказа
    public void addOrder(Order order) {
        orders.add(order);
    }

    // Получение заказа по ID
    public Order getOrderById(String orderId) {
        for (Order order : orders) {
            if (order.getOrderId().equals(orderId)) {
                return order;
            }
        }
        return null; // или выбросить исключение, если предпочтительнее
    }

    // Проверка наличия заказа
    public boolean orderExists(String orderId) {
        return orders.stream().anyMatch(order -> order.getOrderId().equals(orderId));
    }

    // Удаление заказа по ID
    public boolean removeOrder(String orderId) {
        return orders.removeIf(order -> order.getOrderId().equals(orderId));
    }

    // Получение всех заказов
    public List<Order> getAllOrders() {
        return new ArrayList<>(orders); // Возвращаем копию списка для предотвращения изменений извне
    }
}
