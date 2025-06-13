package LabSheets.Question1;

public class Taxi extends Transport{

    public Taxi(String vehicleNumber, double distanceTravelled) {
        super(vehicleNumber, distanceTravelled);
    }

    @Override
    double calculateFare() {
        return 20 * distanceTravelled + 50;
    }

    public void displayDetails(){
        System.out.println("The vehicle type is : Car" );
        System.out.println("The vehicle distance travelled : " + calculateFare());
    }
}
