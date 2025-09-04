public class NotificationService 
{
    public void sendNotification(String type , String message) 
    {
        Notification notification = SimpleNotificationFactory.createNotification(type);
        notification.send(message);
    }
}
