package day32_Predicate_SimpleLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class LambdaPractice {

     /*
    1. write a program that can remove all the special characters from a list of Character
    2. write a program that can remove all the numbers that can divisble by 3 or 5 in arrayList
     */

    public static void main(String[] args) {

        ArrayList<Character> ch = new ArrayList<>();

        ch.addAll(Arrays.asList('A','B','C','D','E','3','4','@','$'));

        System.out.println(ch);

        Predicate<Character> specialCharacter = p -> !Character.isDigit(p) && !Character.isAlphabetic(p);

        ch.removeIf(specialCharacter);

        System.out.println("ch = " + ch);

        System.out.println("===========================================");

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 50; i++){

            numbers.add(i);
        }

        System.out.println("numbers = " + numbers);

        Predicate<Integer> divisibleBy3_5 = p -> p % 3 == 0 || p % 5 ==0;

        numbers.removeIf(divisibleBy3_5);

        System.out.println("numbers = " + numbers);


    }
}
