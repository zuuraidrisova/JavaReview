package day17_WhileLoops;

import java.util.Scanner;

public class MaxMinNumber {

    public static void main(String[] args) {

        //write a program that can ask the user to enter 5 numbers and return a max number

        Scanner scanner = new Scanner(System.in);

        int maxNumber = Integer.MIN_VALUE;

        for(int i = 1; i <= 5; i++){

            System.out.println("Enter a number: "+(i));
            int num = scanner.nextInt();

            if(num > maxNumber){

                maxNumber = num;

            }
        }

        System.out.println("maxNumber = " + maxNumber);


        //write a program that can ask the user to enter 5 numbers and return a min number


        int minNumber = Integer.MAX_VALUE;

        for(int i = 1; i <= 5; i ++){

            System.out.println("Enter a number: "+(i));
            int num = scanner.nextInt();

            if(num < minNumber){

                minNumber = num;
            }


        }

        System.out.println("minNumber = " + minNumber);


    }
}
