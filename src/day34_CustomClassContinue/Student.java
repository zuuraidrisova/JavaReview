package day34_CustomClassContinue;

public class Student {

    // class is not concrete, it is a blueprint
    //object is concrete

    String name;
    char gender;
    int age;
    double gpa;
    boolean married;

    public void setStudentInfo(String name, char gender, int age, double gpa, boolean married){

        this.name = name;
        this.gender = gender;
        this.age = age;
        this.gpa = gpa;
        this.married = married;

    }

    public String toString(){

        return "Name :  "+name+", gender : "+ gender
                +", age : "+age +", gpa : "+gpa+ " married : "+ married;
    }



}
