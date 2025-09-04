public class SimpleNotificationFactory {
    public static Notification createNotification(String type)
    {
        return switch (type) {
            case "EMAIL" -> new EmailNotification();
            
            case "SMS" -> new SMSNotification();

            case "PUSH" ->  new PushNotification();
               
            case "SLACK" -> new SlackNotification();
                
            case "WHATSAPP" -> new WhatsAppNotification();
                
            default -> throw new IllegalArgumentException("Unknown type.");
            
    };
}
}
