package day10_SwitchScanner;

import java.util.Scanner;

public class MaxNumberScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");

        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");

        int num2 = scanner.nextInt();

        System.out.println("Enter third number: ");

        int num3 = scanner.nextInt();

        int maxNumber = (num1 > num2 && num1 > num3) ? num1 : (num2 > num1 && num2 > num3) ? num2 : num3;

        System.out.println("maxNumber = " + maxNumber);
    }
}
