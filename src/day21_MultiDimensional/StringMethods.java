package day21_MultiDimensional;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

       //  toCharArray(); converts string to array of char

        String str = "I like Java";

       char ch [] =  str.toCharArray();

        System.out.println(Arrays.toString(ch));

        //split(value) : splits string  into an array of String

        String [] a = str.split(" ");

        System.out.println(Arrays.toString(a));

        //printing sentence in a descending order of array
        String sentence = "Today is a great day";

        String [] b = sentence.split(" ");

        for (int i = b.length-1; i >= 0; i --){

            System.out.print(b[i]+" ");
        }

        System.out.println();

    }
}
