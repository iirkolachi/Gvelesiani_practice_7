package Task2;

public class NotificationService {
    public static void sendAlert(Notification notification, String message) {
        notification.sendNotification(message);
    }

    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification();
        Notification smsNotification = new SMSNotification();

        sendAlert(emailNotification, "your vote has been submitted!");
        sendAlert(smsNotification, "your vote has been submitted!");
    }
}
