package day11_ScannerContinue;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your sentence: ");
        String word = scanner.next();
        //next() method returns only first word

        System.out.println("word = " + word);

        System.out.println("Enter true or false: ");

        boolean result = scanner.nextBoolean();

        System.out.println("result = " + result);

        //nextLine() : takes everything from Scanner including Enter keyword

    }
}
