package day19_Arrays;

import java.util.Arrays;

public class Arrays_Intro {

    public static void main(String[] args) {

        /* there are 3 main data structures in java:
            1. Arrays
            2.Collection
            3.Maps

     Arrays are used to store multiple values in a single variable, instead of
     declaring separate variables for each value.

        ex: int[] myNum = {10, 20, 30, 40};

        You access an array element by referring to the index number starting 0.

        To find out how many elements an array has, use the length property:

        Arrays size is always fixed!!! once it is set, u cant adjust it

         */

        int[] scores = {100,80,70,50,60};

        System.out.println("scores[0] = " + scores[0]);

        int num1 = scores[2];

        System.out.println("num1 = " + num1);

        System.out.println("===============================================");

        String names [] = {"Sary", "Asan","Alina","Zuura"};

        System.out.println(Arrays.toString(names));

        for(int i = 0; i < names.length; i++){

            System.out.println(names[i]);
        }

        System.out.println("===============================================");

        for(int each : scores){

            System.out.println(each);
        }

        System.out.println("===============================================");
        //print out all emails which are gmail accounts

        String [] emails = { "cybertek@yahoo.com", "cybertek@gmail.com",  "cybertek@hotmail.com","cybertek@outlook.com"};

        for (int i = 0; i < emails.length; i++){

            if(emails[i].endsWith("@gmail.com")){

                System.out.println(emails[i]);
            }
        }






    }
}
