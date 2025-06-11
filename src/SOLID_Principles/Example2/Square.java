package SOLID_Principles.Example2;

public class Square extends Rectangle {

    @Override
    public int calculateArea() {
        return width * width;
    }

    @Override
    public void print() {
        System.out.println("Square area is : " + calculateArea());
    }
}

