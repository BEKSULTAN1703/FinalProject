package services;

public interface NotificationStrategy {
    void send(String message);
}

class EmailNotificationStrategy implements NotificationStrategy {
    @Override
    public void send(String message) {
        System.out.println("Simulating sending email: " + message);
    }
}
class SMSNotificationStrategy implements NotificationStrategy {
    @Override
    public void send(String message) {
        System.out.println("Simulating sending SMS: " + message);
    }
}

public class NotificationService {
    private NotificationStrategy notificationStrategy;

    public NotificationService() {
        // Default strategy can be set here if needed
    }

    // Setting the notification strategy
    public void setNotificationStrategy(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    // Sending a notification using the chosen strategy
    public void sendNotification(String message) {
        if (notificationStrategy == null) {
            throw new IllegalStateException("Notification strategy not set");
        }
        notificationStrategy.send(message);
    }
}

