package test;


import AbstractClasses.Test;

public class Circle extends BasShape implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Circle    123");
    }
}
