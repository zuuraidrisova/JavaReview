package day11_ScannerContinue;

import java.util.Scanner;

public class EmployeeInfo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first name: ");

        String firstName =  scan.next();

        System.out.println("Please enter your last name: ");

        String lastName = scan.next();

        System.out.println("Are you employeed? ");

        boolean employmentStatus = scan.nextBoolean();

        double salary = 0;

        if(employmentStatus == true){

            System.out.println("Enter your salary: ");
            salary = scan.nextDouble();

        }else{

            salary = 0;

        }

        String fullName = firstName +" "+lastName;

        System.out.println("Full name is: "+fullName);
        System.out.println("Employment status: "+ employmentStatus);
        System.out.println("Salary: $"+salary);


    }
}
