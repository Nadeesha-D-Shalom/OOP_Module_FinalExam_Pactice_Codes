package OOP.MOCK_Paper.Question2_2;

public class Truck extends Vehicle{

    private Driver driver; // Aggregation
    private double loadCapacity;

    public Truck(String brand, double speed, Engine engine, Driver driver, double loadCapacity) {
        super(brand, speed, engine);
        this.driver = driver;
        this.loadCapacity = loadCapacity;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void start() {
        System.out.println("Truck is started.....! Peek Peek ");
    }
}
