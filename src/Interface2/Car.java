package Interface2;

public class Car implements Driverble {

    @Override
    public void start() {
        System.out.println("Car Starting");
    }

    @Override
    public void stop() {
        System.out.println("Car Stop");
    }


}
