package OOP.StudentGradingSystem;

public class Main {
    public static void main(String[] args) {
        Student s1 = new UndergraduateStudent("Nadeesha", "St262626",95);
        Student s2 = new PostgraduateStudent("Shalom","ST6672",58);

        s1.displayGrade();
        s2.displayGrade();

        System.out.println();

        s1.setName("Dias");
        s1.setStudentId("ST20000");
        s1.setGrade(95.5);

        System.out.println(s1.getName());
        System.out.println(s1.getStudentId());
        System.out.println(s1.getGrade());
    }
}
