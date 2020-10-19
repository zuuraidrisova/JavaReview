package day37_Constructors;

public class CybertekStudentsObject {

    public static void main(String[] args) {


        CybertekStudents student1 = new CybertekStudents("Zuura",7,"Batch18");
        CybertekStudents student2 = new CybertekStudents("Madina",11, "Batch17");
        CybertekStudents student3 = new CybertekStudents("Gulya",1,"Batch18");

        CybertekStudents [] students = {student1,student2,student3};

        for (CybertekStudents each :  students){

            System.out.println(each);
        }

    }
}
