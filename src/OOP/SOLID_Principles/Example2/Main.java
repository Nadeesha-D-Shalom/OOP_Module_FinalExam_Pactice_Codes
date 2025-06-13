package OOP.SOLID_Principles.Example2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.height = 10;
        rectangle.width = 10;

        rectangle.calculateArea();
        rectangle.print();


        System.out.println("___------------------");

        Square square = new Square();
        square.width = 20;

        square.calculateArea();
        square.print();

    }
}
