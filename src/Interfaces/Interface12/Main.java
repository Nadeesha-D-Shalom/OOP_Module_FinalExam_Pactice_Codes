package Interfaces.Interface12;

public class Main {
    public static void main(String[] args) {

        Drivable drivable = new Car();
        Electric electric = new Car();


        drivable.start();
        drivable.stop();
        electric.charge();

    }
}

