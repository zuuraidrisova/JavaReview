package day10_SwitchScanner;

import java.util.Scanner;

public class SumOfNumbersScanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first number: ");

        byte num1 =  scan.nextByte();

        System.out.println("Enter second number: ");

        byte num2 = scan.nextByte();

        System.out.println("Sum of two numbers is: "+ (num1 + num2));
    }
}
