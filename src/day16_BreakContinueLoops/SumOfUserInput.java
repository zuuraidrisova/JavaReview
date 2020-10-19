package day16_BreakContinueLoops;

import java.util.Scanner;

public class SumOfUserInput {

    public static void main(String[] args) {

        //sum of a number provided by user

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int sum = 0;

        for (int i = 0; i <= num; i++) {

            sum += i ;

        }

        System.out.println("sum = " + sum);
    }

}
