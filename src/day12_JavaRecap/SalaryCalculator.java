package day12_JavaRecap;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your salary: ");

        int salary = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your full name: ");

        String fullName = scan.nextLine();

        System.out.println("Enter your company name: ");

        String companyName = scan.nextLine();

        System.out.println("Enter your job title: ");

        String jobTitle = scan.nextLine();

        System.out.println("Enter your SSN: ");

        long ssn = scan.nextLong();

        scan.close();





    }
}
