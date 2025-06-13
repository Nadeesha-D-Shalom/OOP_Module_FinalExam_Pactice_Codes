package OOP.StudentGradingSystem;

public class PostgraduateStudent extends Student {

    public PostgraduateStudent(String name, String studentId, double grade) {
        super(name, studentId, grade);
    }

    @Override
    public void displayGrade() {
        super.displayGrade();
        if (getGrade() >= 60)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}
