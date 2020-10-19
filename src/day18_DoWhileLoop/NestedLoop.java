package day18_DoWhileLoop;

import java.util.Scanner;

public class NestedLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 2 numbers: ");

            int num1 = scan.nextInt();
            int num2 = scan.nextInt();


            System.out.println("Addition is: " + (num1 + num2));

            System.out.println("Do you want to continue?");
            String answer = scan.next();

            while( !(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){

                System.out.println("Please re-enter yes or no ?");
                answer = scan.next();
            }

            if (answer.equalsIgnoreCase("No")) {

                System.out.println("Thank you for using calculator!");
                break;
            }


        }





    }
}
