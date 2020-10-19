package day14_StringContinue;

import java.util.Scanner;

public class StartEndWords {

    public static void main(String[] args) {

         /*
        Write a program StartEndWords:
	    you have 2 words that must be 5 characters, and check if last letter of first word
	    and first letter of second work are same.
		if either one not 5 chars length:    print "need to be exactly 5 chars length"
		if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
		if they do not match:  print "Buzz - did not match"

		precondition: both words must have exactly 5 characters
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 2 words: ");

        String word1 = scan.next();
        String word2 = scan.next();

        if(word1.length() == 5 && word2.length() == 5){

            if(word1.charAt(word1.length()-1) == word2.charAt(0)){

                System.out.println("Fizz");
            }else{
                System.out.println("Buzz -- did not match");
            }
        }else{

            System.out.println("need to be exactly 5 chars length");
        }

    }
}
