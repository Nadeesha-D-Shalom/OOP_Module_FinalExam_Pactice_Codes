package MOCK_Paper.ArrayList;

import java.util.ArrayList;

public class StudentApp {

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();

        Student s1 = new Student("This is name","STID8883",25);
        Student s2 = new Student();
        Student s3 = new Student();

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);


        for (Student st : studentList){
            st.displayDetails();
            System.out.println();
        }
    }

}
