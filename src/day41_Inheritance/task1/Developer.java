package day41_Inheritance.task1;

public class Developer  extends Employee{

      /*
    	create subclass of employee name it developer:
	     variables: salary, name, id, jobTitle, gender ==> all inherited
	     action: fixingBug, coding
	     create a constructor that can initialize all the attributes of developer

     */

    public Developer(String name, String jobTitle, char gender, double salary, long id){

        this.name = name;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.salary = salary;
        this.id = id;

    }

    public void fixBug(){

        System.out.println(name+" is fixing a bug");
    }

    public void code(){

        System.out.println(name+" is coding");
    }


}
