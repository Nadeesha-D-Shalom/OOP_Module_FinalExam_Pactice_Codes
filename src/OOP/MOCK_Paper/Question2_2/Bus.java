package OOP.MOCK_Paper.Question2_2;

public class Bus extends Vehicle{

    private Driver driver; // Aggregation
    private int passengerCapacity;


    public Bus(String brand, double speed, Engine engine, Driver driver, int passengerCapacity) {
        super(brand, speed, engine);
        this.driver = driver;
        this.passengerCapacity = passengerCapacity;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void start() {
        System.out.println("Bus is started.....! Broom Broom");
    }
}
