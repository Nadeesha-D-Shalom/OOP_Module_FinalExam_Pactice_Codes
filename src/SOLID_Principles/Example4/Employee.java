package SOLID_Principles.Example4;

public class Employee implements Person, PersonEat{

    @Override
    public void eat() {
        System.out.println("Manager eating");
    }

    @Override
    public void work() {
        System.out.println("Student works");
    }


    public void sleep() {
        System.out.println("manager sleep ");
    }
}
