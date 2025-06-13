package OOP.MOCK_Paper.Question2_1;

public class Motorcycle extends Vehicle {

    private Driver driver;
    private String helmetIncluded;


    public Motorcycle(String model, double maxLoad, Engine engine, Driver driver, String helmetIncluded) {
        super(model, maxLoad, engine);
        this.driver = driver;
        this.helmetIncluded = helmetIncluded;
    }

    public Driver getDriver() {
        return driver;
    }

    public String getHelmetIncluded() {
        return helmetIncluded;
    }

    public void setHelmetIncluded(String helmetIncluded) {
        this.helmetIncluded = helmetIncluded;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void start(){
        System.out.println("Motorcycle is Started..!");
    }
}
