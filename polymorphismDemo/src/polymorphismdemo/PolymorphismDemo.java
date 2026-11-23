
package polymorphismdemo;

class Device {

    public void performTask() {
        System.out.println("The device is performing its task.");
    }
}

class Television extends Device {

    @Override
    public void performTask() {
        System.out.println("The television is displaying your favorite movie!");
    }
}

class Speaker extends Device {

    @Override
    public void performTask() {
        System.out.println("The speaker is playing your favorite music!");
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {

        Device myDevice = new Device();
        Device myTV = new Television();
        Device mySpeaker = new Speaker();

        myDevice.performTask();
        myTV.performTask();
        mySpeaker.performTask();
    }
}
