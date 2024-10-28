package Task2;

public class SMSNotification extends Notification{
    @Override
    void sendNotification(String message) {
        System.out.println("SMS notification: " + message);
    }
}
