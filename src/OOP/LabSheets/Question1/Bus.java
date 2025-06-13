package OOP.LabSheets.Question1;

public class Bus extends Transport{

    public Bus(String vehicleNumber, double distanceTravelled) {
        super(vehicleNumber, distanceTravelled);
    }

    @Override
    double calculateFare() {
        return 10 * distanceTravelled;
    }

    public void displayDetails(){
        System.out.println("The vehicle type is : Bus" );
        System.out.println("The vehicle distance travelled : " + calculateFare());
    }


}
