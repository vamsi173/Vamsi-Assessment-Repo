import java.util.Scanner;
interface NotificationService 
{
    void sendNotification(String message);
}
class EmailNotification implements NotificationService 
{
    public void sendNotification(String message) 
    {
        System.out.println("Email Notification sent: " + message);
    }
}
class SMSNotification implements NotificationService 
{
    public void sendNotification(String message) 
    {
        System.out.println("SMS Notification sent: " + message);
    }
}
class PushNotification implements NotificationService 
{
    public void sendNotification(String message) 
    {
        System.out.println("Push Notification sent: " + message);
    }
}
interface NotificationFactory 
{
    NotificationService getNotificationService(String type);
}
class NotificationFactoryImpl implements NotificationFactory 
{
    public NotificationService getNotificationService(String type) 
    {
        if (type.equalsIgnoreCase("EMAIL")) 
        {
            return new EmailNotification();
        } 
        else if (type.equalsIgnoreCase("SMS")) 
        {
            return new SMSNotification();
        } 
        else if (type.equalsIgnoreCase("PUSH")) 
        {
            return new PushNotification();
        } 
        else 
        {
            return null;
        }
    }
}
public class NotificationApp 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter notification type (EMAIL / SMS / PUSH):");
        String type = sc.nextLine();
        System.out.println("Enter notification message:");
        String message = sc.nextLine();
        NotificationFactory factory = new NotificationFactoryImpl();
        NotificationService service = factory.getNotificationService(type);
        if (service != null) 
        {
            service.sendNotification(message);
        } else 
        {
            System.out.println("Invalid notification type");
        }
        sc.close();
    }
}
