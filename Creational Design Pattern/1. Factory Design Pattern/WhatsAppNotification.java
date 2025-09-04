public class WhatsAppNotification implements Notification{
    @Override
    public void send(String message)
    {
        System.out.println("Sending an Whatsapp notification.."+message);
    }
}
