package Ex1;

public class Dog extends Animal {


    @Override
    void eat() {
        System.out.println("I am eating");
    }

    @Override
    void makeSound() {
        System.out.println("Woof Woof");
    }
}
