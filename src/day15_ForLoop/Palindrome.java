package day15_ForLoop;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

         /*
        write a program to identify if a string is palindrome or not.
         if yes==> true,.otherwise ==> false
                level ==> level ==> palindrome
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word");
        String word = scan.next();

        String palindrome = "";

        for(int i = word.length()-1; i >= 0; i--){

            palindrome += word.charAt(i);

        }

        if(word.equalsIgnoreCase(palindrome)){

            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }



    }
}
