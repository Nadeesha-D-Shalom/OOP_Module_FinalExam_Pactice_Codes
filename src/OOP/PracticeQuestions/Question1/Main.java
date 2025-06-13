package OOP.PracticeQuestions.Question1;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.displayStudentDetails();

        Student s2 = new Student(2202,"Test Student",3.2);
        s2.displayStudentDetails();

        Student s3 = new Student(22302,"Test Student 2",4.3);
        s3.displayStudentDetails();

        Student s4 = new Student(22354,"Test Student 3",-1.3);
        s4.displayStudentDetails();
    }
}
