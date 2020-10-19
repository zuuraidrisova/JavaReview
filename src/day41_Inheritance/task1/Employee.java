package day41_Inheritance.task1;

public class Employee {

      /*
    create a  class called Employee:
			variables: salary, name, id, jobTitle, gender
			Actions: toString
			*/

    public double salary;
    public String name;
    public  long id;
    public String jobTitle;
    public char gender;

    public String toString(){

        return "Name: "+name+", JobTitle: "+jobTitle+", Salary: $"
                +salary+", ID: "+id+", Gender: "+gender;
    }

}
