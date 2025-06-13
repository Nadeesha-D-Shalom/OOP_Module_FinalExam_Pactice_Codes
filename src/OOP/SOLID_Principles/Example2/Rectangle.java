package OOP.SOLID_Principles.Example2;

public class Rectangle {

    protected int width;
    protected int height;

    public int calculateArea() {
        return width * height;
    }

    public void print(){
        System.out.println("Rectangle Area is : " + calculateArea());
    }

}

