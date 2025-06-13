package OOP.AbstractionInterface_Prac;

public class SmartWashingMachine extends Appliance implements SmartDevice {

    @Override
    void operate() {
        System.out.println("Washing clothes...");
    }


    @Override
    public void connectToWifi() {
        System.out.println("Connected to WiFi");
    }

}
