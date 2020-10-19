package day16_BreakContinueLoops;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        //remove duplicates from string

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String str = scan.next();

        String noDup = "";

        for(int i = 0; i < str.length(); i++){

            if(!noDup.contains(str.charAt(i)+"")){

                noDup += str.charAt(i);
            }
        }

        System.out.println("noDup = " + noDup);


    }
}
