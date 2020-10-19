package day21_MultiDimensional;

import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {

         /*
        write a program that can return the frequency of the characters in a string
		Ex: "AABCBCA" ==> "A3B2C2"

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String str = scan.next() ;

        String result = "";

        for (int i = 0; i < str.length(); i++){

            int count = 0;

            for(int j = 0; j < str.length(); j++){


                if(str.charAt(i) == str.charAt(j)){

                    count++;
                }
            }

            while(!result.contains(""+ str.charAt(i))){

                result += str.charAt(i)+""+count;
            }
        }

        System.out.println(result);


    }
}
