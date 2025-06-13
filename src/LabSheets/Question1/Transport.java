package LabSheets.Question1;

public abstract class Transport {
    String vehicleNumber;
    double distanceTravelled;

    public Transport(String vehicleNumber, double distanceTravelled) {
        this.vehicleNumber = vehicleNumber;
        this.distanceTravelled = distanceTravelled;
    }

    abstract double calculateFare();

    public void displayDetails(){
        System.out.println("The vehicle number is          : " + vehicleNumber);
        System.out.println("The vehicle distance travelled : " + distanceTravelled);
    }
}
