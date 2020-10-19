package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractChar_Lambda {

    public static void main(String[] args) {

         /*
        write a program that can extract the special characters, digits
         and alphabets from a string and stores them into seperate
          ArrayLists of Character:
        ex:
        str = "ABCD123$%#@&456EFG!";
        list1: {$, %, #, @, &, !}
        list2: {A, B, C, D, E, F, G}
        list3: {1, 2, 3, 4, 5, 6}

 */

        String str = "ABCD123$%#@&456EFG!";

        char ch [] = str.toCharArray();

        //because ArrayList and lambda does not support  primitives
        //so we have to transform char to Character

        Character [] chars = new Character[ch.length];

        for (int i = 0; i < ch.length; i++){

            chars[i] = ch[i];
        }

        System.out.println(Arrays.toString(chars));

        ArrayList<Character> letters = new ArrayList<>(Arrays.asList(chars));

        letters.removeIf(p -> !Character.isAlphabetic(p));

        System.out.println("letters = " + letters);

        ArrayList<Character> digits =  new ArrayList<>(Arrays.asList(chars));

        digits.removeIf(p -> !Character.isDigit(p));

        System.out.println("digits = " + digits);

        ArrayList<Character> special = new ArrayList<>(Arrays.asList(chars));

        special.removeIf(p -> Character.isDigit(p) || Character.isAlphabetic(p));

        System.out.println("special = " + special);

    }
}
