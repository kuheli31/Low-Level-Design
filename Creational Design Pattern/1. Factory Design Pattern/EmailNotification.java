public class EmailNotification implements Notification{
    @Override
    public void send(String message)
    {
        System.out.println("Sending an Email notification.."+message);
    }
}