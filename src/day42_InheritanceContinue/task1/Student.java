package day42_InheritanceContinue.task1;

public class Student extends Person {

    /*
    create a subclass of Person called Student
				attributes: name, age, gender, studentID, class
				methods: attendClass, code, setStudentInfo, toString

				Student is a Person relationship
     */

    public long id;
    public String clazz;
    public static String schoolName = "Cybertek";

    public void setStudentInfo(String name, int age, char gender, long id, String clazz){

        setPersonInfo(name,age, gender);
        this.id = id;
        this.clazz = clazz;
    }

    public void attendClass(){

        System.out.println(name+ " attends class "+ clazz);
    }

    public void code(String programLang){

        System.out.println(name+" codes "+programLang);
    }

    public String toString(){

        return "Name: "+name+", Class of: "+clazz+", SchoolName: "+schoolName+", Student ID: "+id+", Age: "+age

                +", Gender: "+gender;
    }

}
