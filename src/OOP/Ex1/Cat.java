package OOP.Ex1;

public class Cat extends Animal{



    @Override
    void eat() {
        System.out.println("I am eating");
    }

    @Override
    void makeSound() {
        System.out.println("Meaw meaw");
    }
}
