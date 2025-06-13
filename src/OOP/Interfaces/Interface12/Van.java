package OOP.Interfaces.Interface12;

public class Van implements Drivable{

    @Override
    public void start() {
        System.out.println("Van Starts");
    }

    @Override
    public void stop() {
        System.out.println("Van Stops");
    }


}
