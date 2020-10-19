package day32_Predicate_SimpleLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates {

    /*
write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]

 */

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.addAll(Arrays.asList("A", "B", "A", "C", "D"));

        System.out.println("list = " + list);

        ArrayList<String> duplicates = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){

           int count = 0;

           for (int j = 0; j < list.size(); j++){

               if(list.get(i).equals(list.get(j))){

                   count++;
               }
           }

           if(count > 1){

               if(! duplicates.contains(list.get(i))) {
                   // if it is not contained in duplicates yet

                   duplicates.add(list.get(i));//then add
               }
           }
        }


        System.out.println("duplicates = " + duplicates);

        System.out.println("===========================================");


        ArrayList<String> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList("A", "B", "A", "C", "D"));

        System.out.println("list2 = " + list2);

        ArrayList<String> duplicates2 = new ArrayList<>();

        for (String each :  list2){

           int count =  Collections.frequency(list2, each);

           if(count > 1 && !duplicates2.contains(each)){

               duplicates2.add(each);
           }
        }

        System.out.println("duplicates2 = " + duplicates2);


    }
}
