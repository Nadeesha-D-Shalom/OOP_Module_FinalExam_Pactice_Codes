package OOP.AbstractionInterface_Prac;

public interface SmartDevice {

    void connectToWifi();

    default void defultMethod(){
        System.out.println("This is default ");
    }

    static void defultMethod2(){
        System.out.println("This is static ");
    }


}
