package AbstractClasses;

public abstract class Shape {

    abstract void area();
    abstract void calculate();


    ///  Concrete  methods
    void display(){
        System.out.println("shape called - Abstract class");
    }

}
