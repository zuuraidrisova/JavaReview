package day11_ScannerContinue;

import java.util.Scanner;

public class NextLine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you age: ");

        int age = scanner.nextInt();

        scanner.nextLine(); //this is gonna take Enter

        System.out.println("Enter your full name: ");

        String fullName = scanner.nextLine();

        //nextLine() ==> takes everything and Enter keyword as well





    }
}
