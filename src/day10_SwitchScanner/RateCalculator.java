package day10_SwitchScanner;

import java.util.Scanner;

public class RateCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your hourly rate: ");

        int salary = scan.nextInt();

        System.out.println("Please enter how many hours you work weekly: ");

        int hours = scan.nextInt();

        System.out.println("Please enter how many weeks you work monthly: ");

        int weeks = scan.nextByte();

        System.out.println("Your income is: "+ (salary * hours * weeks));


    }
}
