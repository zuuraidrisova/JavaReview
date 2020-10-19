package day37_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Employee {

    /*
     Create a class called Employee
			instance variables:
					name, id, ssn, jobTitle, salary, gender
			actions:
					setEmployeeInfo(): can initialize all the instance variables
					toString(): can return the info of the employee as string
     */

    String name;
    long employee_id;
    long ssn;
    String jobTitle;
    long salary;
    char gender;

    public void setEmployeeInfo(String name, long employee_id, long ssn,
                                String jobTitle, long salary, char gender){

        this.name = name;
        this.employee_id = employee_id;
        this.ssn = ssn;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;

    }

    public String toString(){

        return "Name "+name+" ID number is: "
                +employee_id+" Social Number is: "+ssn
                +" Job Title is: "+ jobTitle
                +" Salary: "+salary
                +" Gender: "+gender;
    }



}

/*
create a class called HumanResources
			declare 5 variables of Employee as static
			use static block to:
						1. initialize those static variables
						2. set all the info of the Employees

 */

class HumanResources{

    static Employee employee1 = new Employee();
    static Employee employee2 = new Employee();
    static Employee employee3 = new Employee();
    static Employee employee4 = new Employee();
    static Employee employee5 = new Employee();


    static { //initialize those static variables

        employee1.setEmployeeInfo("Zuleyha",1254,45874641,"QA",110000,'F');
        employee2.setEmployeeInfo("Jack",1239,111223333, "Tester",100000,'M');
        employee3.setEmployeeInfo("Nedime",1299,4580011,"Tester",120000,'F');
        employee4.setEmployeeInfo("Jazi", 1126, 111112345, "Business Analyst", 70000, 'F');
        employee5.setEmployeeInfo("Marina", 1124, 111234567, "Product Manager", 170000, 'F');

    }



}

/*
create class called BOB
		in the main method:
				1. create a List of Employees
				2. add random three employees from HumanResources to the List
				3. use for each loop to print out the employee info
				4. now go back to HumanResources class and comment out the static block
				5. repeat the step 3 to print out the employee info to compare it with previous output
 */

class BankOfBishkek{

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.addAll(Arrays.asList(HumanResources.employee1, HumanResources.employee2,
                HumanResources.employee3));

        for (Employee each :  employees){

            System.out.println(each);
        }

    }
}