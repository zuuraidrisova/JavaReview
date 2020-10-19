package day20_ArrayUtilities;

import java.util.Scanner;

public class NoDuplicates {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.next();

        String noDup = "";

       for(int i = 0; i < word.length(); i++){

           if(!noDup.contains(""+word.charAt(i))){

               noDup += word.charAt(i);
           }
       }

        System.out.println("noDup = " + noDup);


    }
}
