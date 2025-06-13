package OOP.AbstractionInterface_Prac;

public class Main {

    public static void main(String[] args) {
//
//        SmartWashingMachine swm = new SmartWashingMachine();
//        swm.turnOn();
//        swm.operate();
//        swm.connectToWifi();
//        swm.turnOff();

        System.out.println("------------");
        SmartLight sl = new SmartLight();

        sl.turnOn();
        sl.operate();
        sl.connectToWifi();
        sl.turnOff();
    }
}
