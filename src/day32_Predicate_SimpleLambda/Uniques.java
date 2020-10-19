package day32_Predicate_SimpleLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.addAll(Arrays.asList("Zuura","Irina","Irina","Anna","Anna"));

        System.out.println("list = " + list);

        ArrayList<String> uniques = new ArrayList<>();

        for (String each: list){

           int count = Collections.frequency(list,each);

           if(count == 1){

               uniques.add(each);
           }

        }

        System.out.println("uniques = " + uniques);


    }
}
