package day32_Predicate_SimpleLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PredicatesLambda {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println("list = " + list);

        Predicate<Integer> oddNumber = p -> p % 2 != 0;
                //lambda expression: p stands for number, condition is for odd number

        list.removeIf(oddNumber);

        System.out.println("list = " + list);

        System.out.println(" ======================================= ");

        Predicate<Integer> lessThan5 = p -> p < 5;

        list.removeIf(lessThan5);

        System.out.println("list = " + list);

        System.out.println(" ======================================= ");

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Zuura","Zarina","Zeynep","Alina","Irina"));

        System.out.println("names = " + names);

        Predicate<String> namesWithZ = p -> p.startsWith("Z");

        names.removeIf(namesWithZ);

        System.out.println("names = " + names);

        System.out.println(" ======================================= ");

        ArrayList<Character> ch = new ArrayList<>();

        ch.addAll(Arrays.asList('A','B','C','D','E','3','4','@','$'));

        System.out.println("ch = " + ch);

        Predicate<Character> digits = p -> !Character.isDigit(p);

        ch.removeIf(digits);

        System.out.println("ch = " + ch);

        System.out.println(" ======================================= ");

        ArrayList<Integer> num = new ArrayList<>();

        num.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println("num = " + num);

        num.removeIf(p -> p > 5);//we can pass our lambda condition into method

        System.out.println("num = " + num);

    }
}
