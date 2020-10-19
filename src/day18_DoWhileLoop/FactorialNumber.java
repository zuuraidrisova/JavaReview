package day18_DoWhileLoop;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        /*
write a program that can return the factorial number of any given number
			Ex:
				input: 5
				output: 120
			because:
				5! = 5 * 4 * 3 * 2* 1 = 120
 */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num = scanner.nextInt();

        long result = 1;

        while(num >= 1){

            result *= num;

            num--;
        }

        System.out.println("result = " + result);

    }
}
