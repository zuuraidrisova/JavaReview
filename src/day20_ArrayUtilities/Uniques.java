package day20_ArrayUtilities;

import java.util.Scanner;

public class Uniques {

    public static void main(String[] args) {

        // write a program that can return the unique characters from a string
        //Ex:  "AABCC" ==> "B"

        Scanner scan = new Scanner(System.in);

        String word = scan.next();

        String unique = "";

        for(int i = 0; i < word.length(); i++){

            int count = 0;

            for(int j = 0;  j <  word.length(); j++){

                if(word.charAt(i) == word.charAt(j)){

                    count++;

                }

            }


            if(count == 1){

                unique += word.charAt(i);
            }

        }


        System.out.println("unique = " + unique);


    }
}
