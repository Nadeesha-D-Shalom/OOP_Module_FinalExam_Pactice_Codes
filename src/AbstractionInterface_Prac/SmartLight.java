package AbstractionInterface_Prac;

public class SmartLight extends Appliance implements SmartDevice {


    @Override
    void operate() {
        System.out.println("Lighting the room...");
    }


    @Override
    public void connectToWifi() {
        System.out.println("Light connected to the WIFI");
    }
}
