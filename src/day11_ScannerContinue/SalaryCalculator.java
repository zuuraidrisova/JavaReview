package day11_ScannerContinue;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        //write a program that can calculate salary after tax

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your salary: ");

        int salary = scanner.nextInt();

        System.out.println("Please enter state tax rate: ");

        double stateTaxRate = scanner.nextDouble();

        System.out.println("Please enter federal tax rate: ");

        double federalTaxRate = scanner.nextDouble();

        double totalTax = (stateTaxRate * salary) + (federalTaxRate * salary);
        double salaryAfterTax = salary - totalTax;

        System.out.println("Your salary after tax is: "+ salaryAfterTax);




    }
}
