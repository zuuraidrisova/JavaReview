package day13_StringClass;

import java.util.Scanner;

public class SwitchScannerPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        String word;

        switch (number){

            case 0:
                word = "zero";
                break;
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word= "four";
                break;
            case 5:
                word= "five";
                break;
            case 6:
                word= "six";
                break;
            case 7:
                word= "seven";
                break;
            case 8:
                word= "eight";
                break;
            case 9:
                word = "nine";
                break;
            default:
                word= "invalid";
                break;



        }

        System.out.println("word = " + word);


    }
}
