package OOP.SOLID_Principles.Example5;

public class Main {

    public static void main(String[] args) {

        // SOLID prinsiples
        // D - DIP
        RegularEngine regularEngine = new RegularEngine();

        TurboEngine turboEngine = new TurboEngine();

        Electric electric = new Electric();

        Car car1 = new Car(regularEngine);
        car1.startEngine();

        Car car2 = new Car(turboEngine); // not able to create a car with a different engine
        car2.startEngine();

        Car car3 = new Car(electric);
        car3.startEngine();

    }
}

