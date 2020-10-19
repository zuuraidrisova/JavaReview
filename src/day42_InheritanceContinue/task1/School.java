package day42_InheritanceContinue.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class School {

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setStudentInfo("Zuura",29,'F',90133,"Batch18");
        student2.setStudentInfo("Sary", 29,'M',90111,"ComputerScience");
        student3.setStudentInfo("Aku",31, 'F',90333,"Languages2020");


        ArrayList<Student> students = new ArrayList<>();

        students.addAll(Arrays.asList(student1,student2,student3));

        for (Student each: students){

            System.out.println(each);
        }


    }
}
