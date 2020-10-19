package day19_Arrays;

import java.util.Scanner;

public class Uniques {

    public static void main(String[] args) {

        // write a program that can return the unique characters from a string
        //Ex:  "AABCC" ==> "B"

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word: ");

        String str = scan.next();

        String unique = "";

        for(int i = 0; i < str.length(); i++){

            int count = 0;

            for(int j = 0; j < str.length(); j++){

                if(str.charAt(i) == str.charAt(j)){

                    count++;
                }
            }

            if(count == 1){

                unique += str.charAt(i);

            }

        }


        System.out.println("unique = " + unique);


    }
}
