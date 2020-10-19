package day36_StaticBlocks;

public class Developer {

    String name;
    long employeeID;
    String jobTitle;
    double salary;


    public void setDeveloperInfo(String name, long employeeID, String jobTitle, double salary){

        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;


    }
    public String toString(){

        return "name : " + name +" employeeID : "+ employeeID +
                " jobTitle : "+ jobTitle + " salary : "+salary;

    }

    public void code(String programLanguage){

        System.out.println(name + " is coding in "+programLanguage);
    }

    public void createTicket(){

        System.out.println(name + " is creating a ticket");

    }
     /*
    create a class called Developers
			Attributes:
				name, employeeID, JobTitle, Salary
			Actions:
				setDeveloperInfo(), coding(),  creatingTicket();


     */
}
