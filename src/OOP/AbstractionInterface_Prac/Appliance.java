package OOP.AbstractionInterface_Prac;

public abstract class Appliance {

    abstract void operate();

    void turnOn(){
        System.out.println("Appliance is turned on");
    }

    void turnOff(){
        System.out.println("Appliance is turned off");
    }

}
