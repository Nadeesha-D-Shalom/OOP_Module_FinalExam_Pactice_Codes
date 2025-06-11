package AbstractClasses;

public class Circle extends Shape {

    private int r;

    public Circle(int r){
        this.r = r;
    }

    @Override
    void area() {
        System.out.println("Area is: " + (3.14 * r * r ));
    }

    @Override
    void calculate() {
        System.out.println("This is calculating... ");
    }

//    @Override
//    public void printTest() {
//        System.out.println("This is circle test interface.....! ");
//    }
}
