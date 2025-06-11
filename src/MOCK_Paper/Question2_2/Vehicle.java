package MOCK_Paper.Question2_2;

public class Vehicle {

    private String brand;
    private double speed;
    private Engine engine; // Composition


    public Vehicle(){

    }

    public Vehicle(String brand, double speed, Engine engine) {
        this.brand = brand;
        this.speed = speed;
        this.engine = engine;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        System.out.println("!......This is Vehicle Engine....!");
    }


}
