package order;

public interface OrderState {
    void next(Order order);
    void previous(Order order);
    void printStatus();
}
