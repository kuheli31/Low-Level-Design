public class SlackNotification implements Notification{
    @Override
    public void send(String message)
    {
        System.out.println("Sending an Slack notification.."+message);
    }
}
