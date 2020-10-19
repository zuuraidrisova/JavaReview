package day10_SwitchScanner;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        //Scanner is a class which is presented in java,util package
        // and we have to import it in order to use
        //Scanner is a class which allows us to get user input
        //we have to create an object of the Scanner class so we can use this class methods

        /*
        Scanner class methods:

        nextByte() : takes user input and returns as a byte
        nextShort() : takes user input and returns as a short
        nextInt() : takes user input and returns as an int
        nextFloat(): takes user input and returns as a float
        nextDouble() : takes user input and returns as a double
        nextBoolean() : takes user input and returns as a boolean
        nextLong() :  takes user input and returns as a long
        next() :        takes user input and returns as a String , but only first word
        nextLine() : takes user input and returns everything as a String even Enter keyword


         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        byte num1 =  scan.nextByte();

        System.out.println("num1 = " + num1);

        String result = (num1 % 2 ==0) ? "Even" : "Odd";

        System.out.println("result = " + result);


    }
}
