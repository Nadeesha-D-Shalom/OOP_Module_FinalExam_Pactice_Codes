package OOP.Abstraction2;

public class Dog extends Animal {

    @Override
    void eat() {
        System.out.println("Dog eating");
    }

    @Override
    void makeSound() {
        System.out.println("Woof Woof");
    }

}
