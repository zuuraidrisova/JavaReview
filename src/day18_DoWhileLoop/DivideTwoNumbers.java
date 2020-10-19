package day18_DoWhileLoop;

import java.util.Scanner;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        // divide 2 numbers without division, use subtraction

        Scanner scan = new Scanner(System.in);

        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();

        int count = 0;

        while(firstNumber >= secondNumber){

           firstNumber =  firstNumber - secondNumber;

           count++;
        }

        System.out.println("count = " + count);
        System.out.println("remainder = " + firstNumber);

    }
}
