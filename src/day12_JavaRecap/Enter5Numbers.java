package day12_JavaRecap;

import java.util.Scanner;

public class Enter5Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");

        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");

        int num2 = scanner.nextInt();

        System.out.println("Enter third number: ");

        int num3 = scanner.nextInt();

        System.out.println("Enter fourth number: ");

        int num4 = scanner.nextInt();

        System.out.println("Enter fifth number: ");

        int num5 = scanner.nextInt();


        int sum = 0;

        if (num1 > 0){

            sum += num1;
        }

        if (num2 > 0){

            sum += num2;
        }
        if (num3 > 0){

            sum += num3;
        }
        if (num4 > 0){

            sum += num4;
        }
        if (num5 > 0){

            sum += num5;
        }


        System.out.println("sum of 5 numbers = " + sum);
    }
}
