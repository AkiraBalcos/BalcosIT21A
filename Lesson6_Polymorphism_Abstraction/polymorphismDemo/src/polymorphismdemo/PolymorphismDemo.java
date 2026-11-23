
package polymorphismdemo;

class Notification {

    public void sendNotification() {
        System.out.println("The notification is being sent.");
    }
}

class EmailNotification extends Notification {

    @Override
    public void sendNotification() {
        System.out.println("The email says: Your order has been confirmed!");
    }
}

class SMSNotification extends Notification {

    @Override
    public void sendNotification() {
        System.out.println("The SMS says: Your order is on its way!");
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {

        Notification myNotification = new Notification();
        Notification myEmail = new EmailNotification();
        Notification mySMS = new SMSNotification();

        myNotification.sendNotification();
        myEmail.sendNotification();
        mySMS.sendNotification();
    }
}
