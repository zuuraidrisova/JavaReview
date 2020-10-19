package day20_ArrayUtilities;

import java.util.Scanner;

public class Month2 {

    public static void main(String[] args) {


        String [] months = {"January","February", "March", "April", "May", "June", "July"
         ,"August", "September", "October", "November", "December"};

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        while( num <= 0 || num > 12){

            System.out.println("Invalid Entry");
            System.out.println("Please re-enter");
            num = scan.nextInt();

        }

        String result = months[num-1];


        System.out.println("result = " + result);


    }
}
