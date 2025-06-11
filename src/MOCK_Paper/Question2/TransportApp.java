package MOCK_Paper.Question2;

public class TransportApp {
    public static void main(String[] args) {
        // Create Engines
        Engine busEngine = new Engine("Diesel 300HP");
        Engine truckEngine = new Engine("Turbo Diesel 500HP");

        // Create Drivers
        Driver busDriver = new Driver("John Doe", "D12345");
        Driver truckDriver = new Driver("Alice Smith", "T67890");

        // Create Bus and Truck with Drivers
        Bus bus = new Bus("Volvo", 80.0, busEngine, busDriver);
        Truck truck = new Truck("Scania", 70.0, truckEngine, truckDriver);

        // Start vehicles
        bus.start();
        truck.start();

        // Display full details
        System.out.println("=== Bus Details ===");
        System.out.println("Brand: " + bus.getBrand());
        System.out.println("Speed: " + bus.getSpeed() + " km/h");
        System.out.println("Engine Type: " + bus.getEngine().getEngineType());
        System.out.println("Driver Name: " + bus.getDriver().getName());
        System.out.println("Driver License: " + bus.getDriver().getLicenseNumber());

        System.out.println();

        System.out.println("=== Truck Details ===");
        System.out.println("Brand: " + truck.getBrand());
        System.out.println("Speed: " + truck.getSpeed() + " km/h");
        System.out.println("Engine Type: " + truck.getEngine().getEngineType());
        System.out.println("Driver Name: " + truck.getDriver().getName());
        System.out.println("Driver License: " + truck.getDriver().getLicenseNumber());



        System.out.println("\n\nEngine Type: " + truck.getEngine().getEngineType());

    }
}

