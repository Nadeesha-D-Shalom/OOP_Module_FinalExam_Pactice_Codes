package Interfaces;

public class Car implements Electric{

    public void start(){
        System.out.println("Car is starting");
    }

    public void stop(){
        System.out.println("Car is stopped");
    }

    @Override
    public void charge() {
        System.out.println("Charging.....");
    }


    @Override
    public void speed() {
        System.out.println("This is new Speed 500 kmh");
    }
}
