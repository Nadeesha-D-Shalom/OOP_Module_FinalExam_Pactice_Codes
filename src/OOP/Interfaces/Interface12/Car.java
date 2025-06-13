package OOP.Interfaces.Interface12;

public class Car implements Drivable,Electric {


    @Override
    public void start() {
        System.out.println("Car engine Starts.. ");
    }

    @Override
    public void stop() {
        System.out.println("Car engine Stops");
    }

    @Override
    public void charge() {
        System.out.println("Car is charging");
    }
}
