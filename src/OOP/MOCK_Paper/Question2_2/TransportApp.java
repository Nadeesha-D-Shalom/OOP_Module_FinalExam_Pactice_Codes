package OOP.MOCK_Paper.Question2_2;

public class TransportApp {
    public static void main(String[] args) {

        // engine created
        Engine busEngine = new Engine("Diesel");
        Engine truckEngine = new Engine("Turbo engine");

        // Driver
        Driver busDriver = new Driver("Chamidu","345678887VDG");
        Driver truckDriver = new Driver("Truck Driver", "WE23456789");

        Bus bus = new Bus("Volvo",120.22,busEngine,busDriver,52);
        Truck truck = new Truck("Bendly",110.00,truckEngine,truckDriver,10000);


        System.out.println("Bus Details: ");
        bus.start();
        System.out.println("Bus brand   : " + bus.getBrand());
        System.out.println("Bus speed   : " + bus.getSpeed());
        System.out.println("Engine Type : " + bus.getEngine().getEngineType());
        System.out.println("Driver Details : " + bus.getDriver().getName() + " License Number : " + bus.getDriver().getLicenseNumber());
        System.out.println("Bus Capacity   : " + bus.getPassengerCapacity());

        System.out.println("\nTruck Details: ");
        bus.start();
        System.out.println("Truck brand     : " + truck.getBrand());
        System.out.println("Truck speed     : " + truck.getSpeed());
        System.out.println("Engine Type     : " + truck.getEngine().getEngineType());
        System.out.println("Driver Details  : " + truck.getDriver().getName() + " License Number : " + truck.getDriver().getLicenseNumber());
        System.out.println("Truck Capacity  : " + truck.getLoadCapacity());

    }
}
