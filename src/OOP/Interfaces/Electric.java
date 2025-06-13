package OOP.Interfaces;

public interface Electric extends Vehicle {



    void charge();

    // concrete methods
    default void speed(){
        System.out.println("Default Speed is 00");
    }


    static void miles(){
        System.out.println("No miles entered 00 ");
    }


}
