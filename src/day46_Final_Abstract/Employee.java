package day46_Final_Abstract;

public abstract class Employee {
    /*
    Task02:
		1. create an abstract class called Employee
				attributes: name, age, gender, salary, jobtitle
				methods:
						abstract methods: work()
						instance method: toString()
		2. create two sub classes of the Employee:
									1. Tester
									2. Developer
					each class MUST have constructors to initialize the attributes
     */

    public String name;
    public  int age;
    public char gender;
    public  double salary;
    public String jobTitle;

    public abstract void work();

    public String toString(){

        return name+" "+jobTitle+" "+gender+" "+age+" "+salary;
    }


}

class Tester extends  Employee{

    public Tester(String name,int age, char gender, double salary, String jobTitle) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.jobTitle = jobTitle;

    }

    @Override
    public void work(){

        System.out.println(name + " works 8 hours a day");
    }


}

class Developer extends Employee{

    public Developer(String name,int age, char gender, double salary, String jobTitle) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.jobTitle = jobTitle;

    }

    @Override
    public void work(){

        System.out.println(name + " works 8 hours a day");
    }

}