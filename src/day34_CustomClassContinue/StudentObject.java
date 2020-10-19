package day34_CustomClassContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.setStudentInfo("Adam", 'M',34,3.5, true);

        Student student2 = new Student();

        student2.setStudentInfo("Kuzya", 'F',23,3.7,false);

        Student student3 = new Student();

        student3.setStudentInfo("Aza", 'M',45,2.5, true);

        Student student4 = new Student();

        student4.setStudentInfo("Aliya", 'F', 21, 4.0, true);

        Student student5 = new Student();

        student5.setStudentInfo("Kim", 'F', 33,2.0, true);

        ArrayList<Student> students = new ArrayList<>();

        students.addAll(Arrays.asList(student1,student2,student3,student4,student5));

        students.removeIf(p -> p.gpa < 3.0);

        for (Student each: students){

            System.out.println(each.name+" can graduate");
        }

    }
}
