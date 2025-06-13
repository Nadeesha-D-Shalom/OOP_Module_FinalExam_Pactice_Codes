package OOP.StudentGradingSystem;

public class UndergraduateStudent extends Student {

    public UndergraduateStudent(String name, String studentId, double grade) {
        super(name, studentId, grade);
    }

    @Override
    public void displayGrade() {
        super.displayGrade();
        if (getGrade() >= 50)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}
