package day42_InheritanceContinue.task1;

public class Employee extends Person {

    /*
    create a sub class of person called Employee
				attributes: name, age, gender, Salary, employeeID, jobTitle
				methods: work, setEmployeeInfo, toString

				Employee is a Person relationship
     */

    public double salary;
    public long id;
    public String jobTitle;

    public void setEmployeeInfo(String name, int age, char gender, double salary, long id,String jobTitle){

        setPersonInfo(name, age, gender);
        this.gender = gender;
        this.salary = salary;
        this.id = id;

    }

    public void work(){

        System.out.println(name +" works as "+jobTitle);
    }

    public String toString(){

        return "Name: "+name+", JobTitle: "+jobTitle+", Salary: "+salary+", ID: "+id
                +", Age: "+age+", Gender: "+gender;
    }


}
