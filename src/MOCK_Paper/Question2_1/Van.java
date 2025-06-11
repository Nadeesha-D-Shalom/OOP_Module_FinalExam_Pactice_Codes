package MOCK_Paper.Question2_1;

public class Van extends Vehicle {
    private Driver driver;
    private int maxSpeed;

    public Van(String model, double maxLoad, Engine engine, Driver driver, int maxSpeed) {
        super(model, maxLoad, engine);
        this.driver = driver;
        this.maxSpeed = maxSpeed;
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void start(){
        System.out.println("Van is Started..!");
    }
}
