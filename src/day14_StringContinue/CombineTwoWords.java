package day14_StringContinue;

import java.util.Scanner;

public class CombineTwoWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 2 numbers:  ");

        String one = scanner.next();
        String two = scanner.next();

        String result = one.concat(two).concat(one).concat(two);

        System.out.println("result = " + result);


    }
}
