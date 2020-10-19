package day33_CustomClass;

import java.util.ArrayList;

public class ExtractCharsDigitsAlphabets {

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

        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits =  new ArrayList<>();
        ArrayList<Character> special = new ArrayList<>();

       for (int i = 0; i < str.length(); i++){

           char each = str.charAt(i);

           if(Character.isAlphabetic(each)){

               letters.add(each);

           }else if(Character.isDigit(each)){

               digits.add(each);

           }else{

               special.add(each);
           }
       }


        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("special = " + special);



    }
}
