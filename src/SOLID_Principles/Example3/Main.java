package SOLID_Principles.Example3;

public class Main {


    private static void makeAnimalMove(Animal animal) {
        animal.move();
    }


    public static void main(String[] args) {

        Bird bird = new Bird();
        makeAnimalMove(bird);
    }


}
