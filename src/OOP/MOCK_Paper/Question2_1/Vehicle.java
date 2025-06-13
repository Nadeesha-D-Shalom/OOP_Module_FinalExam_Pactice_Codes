package OOP.MOCK_Paper.Question2_1;

public class Vehicle {

    private String model;
    private double maxLoad;
    private Engine engine;


    public Vehicle(String model, double maxLoad, Engine engine) {
        this.model = model;
        this.maxLoad = maxLoad;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        System.out.println("This is a default message Vehicle Class");
    }
}
