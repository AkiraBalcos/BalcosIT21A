
package abstractiondemo;

abstract class SmartDevice {

    public abstract void turnOn();

    public void showStatus() {
        System.out.println("The smart device is now active.");
    }
}

class SmartLight extends SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("The smart light says: Turning on the lights!");
    }
}

class SmartFan extends SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("The smart fan says: Spinning the fan!");
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {

        SmartLight myLight = new SmartLight();
        SmartFan myFan = new SmartFan();

        myLight.turnOn();
        myLight.showStatus();

        myFan.turnOn();
        myFan.showStatus();
    }
}
