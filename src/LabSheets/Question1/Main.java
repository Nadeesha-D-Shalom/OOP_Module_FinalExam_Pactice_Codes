package LabSheets.Question1;

public class Main {
    public static void main(String[] args) {
        Transport bus = new Bus("NC-5588",520);
        bus.displayDetails();

        Transport taxi = new Taxi("ACA-5588",620);
        taxi.displayDetails();
    }
}
