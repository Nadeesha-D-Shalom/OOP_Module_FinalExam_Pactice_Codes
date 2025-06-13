package LabSheets.Question3;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("IJ25654","Alice");

        Student.universityName = "SLIIT";
        student.displayStudentInfo();
    }
}
