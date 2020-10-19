package day41_Inheritance.task1;

public class Tester extends Employee {

    /*
    create sub class of employee name it Tester:
			variables: salary, name, id, jobTitle, gender ==> all inherited
			actions: reportingBug, testing
			create a constructor that can initialize all the attributes of Tester
     */

    public Tester(String name, String jobTitle, char gender, double salary, long id){

        this.name = name;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.salary = salary;
        this.id = id;

    }

    public void reportBug(){

        System.out.println(name+" is reporting a bug");
    }

    public void test(){

        System.out.println(name+" is testing the app");
    }

}
