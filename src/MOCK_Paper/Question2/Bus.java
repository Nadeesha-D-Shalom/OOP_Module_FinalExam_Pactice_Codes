package MOCK_Paper.Question2;

public class Bus extends Vehicle {

    private Driver driver; // Aggregation

    public Bus(String brand, double speed, Engine engine, Driver driver) {
        super(brand, speed, engine);
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void start() {
        System.out.println("This is bus");
    }
}
