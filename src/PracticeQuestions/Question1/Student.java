package PracticeQuestions.Question1;

public class Student {

    private int studentID;
    private String studentName;
    private double gpa;

    public Student(){
        this.studentID = 0;
        this.studentName = "N/A";
        this.gpa = 0.0;
    }

    public Student(int studentID, String studentName, double gpa) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.gpa = gpa;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa < 0.0)
            System.out.println("GPA cannot be negative");

        else if (gpa > 4.0)
            System.out.println("GPA cannot be more than 4.0");

        else
            this.gpa = gpa;
    }

    public void displayStudentDetails(){

        System.out.println("\nStudent Details ---");
        System.out.println("Student ID :- " + studentID);
        System.out.println("Student Name :- " + studentName);
        if (gpa < 0.0)
            System.out.println("GPA cannot be negative");

        else if (gpa > 4.0)
            System.out.println("GPA cannot be more than 4.0");

        else
            System.out.println("Student GPA:- " + gpa);
    }


}
