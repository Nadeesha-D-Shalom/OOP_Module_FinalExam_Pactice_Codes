package OOP.Ex1;

public class Main  {

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.makeSound();

        System.out.println("-------");

        Animal cat = new Cat();
        cat.eat();
        cat.makeSound();
    }


}
