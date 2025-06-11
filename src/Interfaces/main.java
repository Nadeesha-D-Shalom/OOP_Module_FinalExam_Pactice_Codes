package Interfaces;

public class main {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.start();
        c1.stop();

        System.out.println("-------------");

        c1.speed();
        c1.charge();
//
        Electric.miles();// static need to call using the interface name

    }
}
