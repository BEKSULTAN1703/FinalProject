package order;

// Новый заказ
class NewOrderState implements OrderState {
    public void next(Order order) {
        order.setState(new ProcessingOrderState());
    }

    public void previous(Order order) {
        System.out.println("The order is in its root state.");
    }

    public void printStatus() {
        System.out.println("Order placed. It's in new state.");
    }
}

class ProcessingOrderState implements OrderState {
    public void next(Order order) {
        order.setState(new ShippedOrderState());
    }

    public void previous(Order order) {
        order.setState(new NewOrderState());
    }

    public void printStatus() {
        System.out.println("Order is being processed.");
    }
}

class ShippedOrderState implements OrderState {
    public void next(Order order) {
        order.setState(new DeliveredOrderState());
    }

    public void previous(Order order) {
        order.setState(new ProcessingOrderState());
    }

    public void printStatus() {
        System.out.println("Order shipped.");
    }
}

class DeliveredOrderState implements OrderState {
    public void next(Order order) {
        System.out.println("Order delivered. No next state.");
    }

    public void previous(Order order) {
        order.setState(new ShippedOrderState());
    }

    public void printStatus() {
        System.out.println("Order delivered to customer.");
    }
}
