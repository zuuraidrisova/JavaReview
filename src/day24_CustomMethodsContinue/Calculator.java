package day24_CustomMethodsContinue;

import day10_SwitchScanner.DaysSwitch;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        while(true) {


            System.out.println("Please enter first number: ");
            int num1 = scan.nextInt();
            System.out.println("Enter second number: ");
            int num2 = scan.nextInt();
            System.out.println("Enter math operator: ");
            char operator = scan.next().charAt(0);

            calculate(num1, num2, operator);

            System.out.println("Do you want to continue? ");
            String answer = scan.next();

            while(! (answer.equalsIgnoreCase("No")
                    || answer.equalsIgnoreCase("yes"))){

                System.out.println("Invalid entry! Please answer yes or no?  ");
                answer = scan.next();

            }

            if (answer.equalsIgnoreCase("No")) {

                System.out.println("Thank you for using calculator!");
                break;
            }

        }



    }

    public static void calculate(int num1, int num2, char operator){

        switch (operator){

            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}
