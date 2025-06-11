package MOCK_Paper.Question2_1;

public class DeliveryApp {

    public static void main(String[] args) {

        Engine vanE = new Engine("Turbo QAZ");
        Engine motoE = new Engine("Kavasaki QAZ");

        Driver vanDriver = new Driver("Van Driver 1","5678956K");
        Driver motoDriver = new Driver("Moto Driver 25","5600056K");

        Van van = new Van("Toyota",850.0,vanE,vanDriver,100);
        Motorcycle motorcycle = new Motorcycle("Kavasaki",120.2,motoE,motoDriver,"Yes");


        System.out.println("Van Details--------");
        van.start();
        System.out.println("Vehicle Model   : " + van.getModel());
        System.out.println("Max Load        : " + van.getMaxLoad() + "kg");
        System.out.println("Engine Type     : " + van.getEngine().getEngineType());
        System.out.println("Driver Name     : " + van.getDriver().getName());
        System.out.println("Max Speed       : " + van.getMaxSpeed());

        System.out.println("\n===============  Next Details =================");
        System.out.println("\nMotorcycle Details--------");
        motorcycle.start();

        System.out.println("Motorcycle Model   : " + motorcycle.getModel());
        System.out.println("Max Load        : " + motorcycle.getMaxLoad() + "kg");
        System.out.println("Engine Type     : " + motorcycle.getEngine().getEngineType());
        System.out.println("Driver Name     : " + motorcycle.getDriver().getName());
        System.out.println("Helmet Included : " + motorcycle.getHelmetIncluded());


    }
}
