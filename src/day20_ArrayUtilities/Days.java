package day20_ArrayUtilities;

import java.util.Scanner;

public class Days {

    public static void main(String[] args) {

        String days [] = {"Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun"};

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");

        int num = scan.nextInt();

        int attempt = 1;

        while(num > 7 || num < 1 ){

            System.out.println("Invalid Entry!");
            System.out.println("Please re-enter the number: ");
            num = scan.nextInt();

            attempt++;

            if(attempt == 3 && (num > 7 || num < 1)){

                System.exit(0);
            }
        }

        String result = days[num-1];

        System.out.println("result = " + result);


    }
}
