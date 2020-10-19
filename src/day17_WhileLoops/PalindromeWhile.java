package day17_WhileLoops;

import java.util.Scanner;

public class PalindromeWhile {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = scan.next();

       String reversed = "";

       int i = word.length()-1;

       while(i >= 0){

           reversed += word.charAt(i);

           i--;
       }

        System.out.println("reversed = " + reversed);


       if(word.equals(reversed)){

           System.out.println("it is a palindrome");
       }else{

           System.out.println("it is not a palindrome");
       }

    }
}
