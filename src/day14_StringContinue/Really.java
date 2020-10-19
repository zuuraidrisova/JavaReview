package day14_StringContinue;

import java.util.Scanner;

public class Really {

    public static void main(String[] args) {

         /*
        Ask user to enter a word. Print "really?"
        if the word ends with ly, print "never mind" otherwise.
			Input:
				Seriously
			Output:
				really?
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word: ");

        String word = scan.next();

        if(word.endsWith("ly")){

            System.out.println("really!");
        }else{

            System.out.println("Never mind!");
        }
    }
}
