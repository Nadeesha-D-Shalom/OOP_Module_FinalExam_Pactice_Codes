package Abstraction2;

public class Cat extends Animal {

    @Override
    void eat() {
        System.out.println("Cat Eating");
    }

    @Override
    void makeSound() {
        System.out.println("Meaw Meaw");
    }
}
