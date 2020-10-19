package day20_ArrayUtilities;

import java.util.Arrays;

public class StringMethodsRelatedToArray {

    public static void main(String[] args) {

        /*

        toCharArray():  takes a string and returns an array of chars
         */

        String name = "Zuura";

        char [] ch = name.toCharArray();

        System.out.println(Arrays.toString(ch));

        String str = "Cybertek School";
        String str2 = "School Cybertek";

        char a [] = str.toCharArray();
        char b [] = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        boolean equal = Arrays.equals(a,b);

        System.out.println("equal = " + equal);


    }
}
