package day17_WhileLoops;

import java.util.Scanner;

public class CalculatorForLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i == 0; ) {


            System.out.println("Enter first number: ");
            int num1 = scan.nextInt();

            System.out.println("Enter second number: ");
            int num2 = scan.nextInt();

            System.out.println("Enter math operator: ");
            String operator = scan.next();

            if (operator.equals("+")) {

                System.out.println("Addition is: " + (num1 + num2));

            } else if (operator.equals("-")) {

                System.out.println("Subtraction is: " + (num1 - num2));

            } else if (operator.equals("*")) {

                System.out.println("Multiplication is: " + (num1 * num2));

            } else if (operator.equals("/")) {

                System.out.println("Division is: " + (num1 / num2));

            } else if (operator.equals("%")) {

                System.out.println("Remainder is: " + (num1 % num2));
            } else {

                System.out.println("Enter a valid math operator");
            }


            System.out.println("Do you want to continue? ");
            String answer = scan.next();

            if (answer.equalsIgnoreCase("no")) {

                System.out.println("Thank you for using calculator!");

                break;
            }



        }




    }
}
