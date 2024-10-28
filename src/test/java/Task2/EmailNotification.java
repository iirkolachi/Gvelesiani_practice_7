package Task2;

public class EmailNotification extends Notification{
    @Override
    void sendNotification(String message) {
        System.out.println("Email notification: " + message);
    }
}
