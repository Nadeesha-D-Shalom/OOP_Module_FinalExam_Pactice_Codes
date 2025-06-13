package OOP.Ex2;

public class Enmployee implements Printable {

    private String name;
    private String id;

    public Enmployee(String name, String id){
        this.name = name;
        this.id = id;
    }


    @Override
    public void print() {
        System.out.println("Student name : " + name);
        System.out.println("Student ID : " + id);
    }
}
