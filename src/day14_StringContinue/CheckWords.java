package day14_StringContinue;

import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args) {
        /*
     Write a program CheckWords:
	Program accepts 3 words and :
	- if they are same length:      print "All words are same length"
	- if some same length and others not:    print "Not Same nor Different lengths"
	- if all different length :  print "All different length"
     */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 3 words: ");

        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();

        if(word1.length() == word2.length() && word1.length() ==  word3.length()){

            System.out.println("All words are same length");

        }else if(word1.length() != word2.length() && word1.length() !=  word3.length()){

            System.out.println("All different length");
        }else{

            System.out.println("Not Same nor Different lengths");
        }



    }
}
