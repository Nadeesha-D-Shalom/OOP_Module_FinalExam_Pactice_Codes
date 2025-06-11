package MOCK_Paper.ArrayList;

public class Student {

    private String name;
    private String StdId;
    private int batch;

    public Student(){
        this.name = "Test name";
        this.StdId = "test student id";
        this.batch = 0;
    }

    public Student(String name, String stdId, int batch) {
        this.name = name;
        StdId = stdId;
        this.batch = batch;
    }

    public void displayDetails(){
        System.out.println(this.name);
        System.out.println(this.StdId);
        System.out.println(this.batch);
    }
}

