package day14_StringContinue;

import java.util.Scanner;

public class CuttingOutFirstLetters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 2 words: ");

        String one = scan.next();
        String two = scan.next();

        String result = one.substring(1).concat(two.substring(1));

        System.out.println("result = " + result);


    }
}
