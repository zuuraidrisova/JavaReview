package day14_StringContinue;

import java.util.Scanner;

public class DisplayMiddleCharacter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");

        String next =scan.next();

        String middle;
        int total = next.length();
        int midNum = total / 2;

        if(next.length() % 2 != 0){

            middle = next.substring(midNum, midNum+1);

        }else{

            middle = next.substring(midNum-1, midNum+1);
        }

        System.out.println("middle = " + middle);




    }
}
