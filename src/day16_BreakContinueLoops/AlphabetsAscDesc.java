package day16_BreakContinueLoops;

public class AlphabetsAscDesc {

    public static void main(String[] args) {

       /*
         Write a program that will print out all letters
         in English alphabet in ascending order
         Write a program that will print out all letters
         in English alphabet in descending order

         */

        for(char i = 97; i <= 122; i++){

            System.out.print(i+", ");
        }

        System.out.println();

        for(char i = 122; i >= 97; i--){

            System.out.print(i+", ");
        }

        System.out.println();

        for(char i = 'A'; i <= 'Z'; i++){

            System.out.print(i+" ");
        }

        System.out.println();

        for(char i = 'Z'; i >= 'A'; i--){

            System.out.print(i+" ");
        }
    }
}
