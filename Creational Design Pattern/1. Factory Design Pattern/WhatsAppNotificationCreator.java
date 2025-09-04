class WhatsAppNotificationCreator extends NotificationCreator{
    @Override
    public Notification createNotification() {
        return new WhatsAppNotification();
    }
}
