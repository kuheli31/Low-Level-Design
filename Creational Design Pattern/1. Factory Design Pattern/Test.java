
public class Test {
    public static void main(String[] args) {
        NotificationCreator creator;

        creator = new EmailNotificationCreator();
        creator.send("Welcome to our platform!");

        // Send SMS
        creator = new SMSNotificationCreator();
        creator.send("Your OTP is 123456");

        // Send Push Notification
        creator = new PushNotificationCreator();
        creator.send("You have a new follower!");

        //Send Slack Notification
        creator = new SlackNotificationCreator();
        creator.send("Welcome to the Slack community!");

        //Send Whatsapp Notification
        creator = new WhatsAppNotificationCreator();
        creator.send("Message from your Dad.");
    }
}
