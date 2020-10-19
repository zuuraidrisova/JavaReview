package day37_Constructors;

public class Student {

    String name;
    char gender;
    int age;
    String university;

    public Student(String name, char gender, int age, String university){

        this.name = name;
        this.gender = gender;
        this.age = age;
        this.university = university;

    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", university='" + university;
    }
}
