package day32_Predicate_SimpleLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethod {

    public static void main(String[] args) {

        /*
       COLLECTION METHODS :

        sort(Collection type) : sorts any given collections type in ascending order

        min(Collection type): returns min object from collection type

        max(Collection type): returns max object from collection type

        frequency(Collection type): returns frequency of object from collection types

        swap(Collection type, index1, index2):  switches elements index1 with index2

        replaceAll(Collection type, oldValue, newValue): replaces old with new value

         */

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println("list = " + list);

       int max =  Collections.max(list);

       int min = Collections.min(list);

        System.out.println("max = " + max);

        System.out.println("min = " + min);

        System.out.println("=============================================");
        /*

        write a program that can return the second max number from ArrayList

        ex: {1,2,3,4,5,6,7,8,8}; output 7

        write a program that can return the second min number from ArrayList

        ex: {1,1,2,3,4,5,6,7,8,8}; output 2

         */

        list.removeAll(Arrays.asList(max));//removes all max number
        list.removeAll(Arrays.asList(min));//removes all min number

        int secondMax = Collections.max(list);
        int secondMin = Collections.min(list);

        System.out.println("secondMax = " + secondMax);
        System.out.println("secondMin = " + secondMin);

        System.out.println("=============================================");

        System.out.println("list = " + list);//[2, 3, 4, 5, 6, 7, 8]

        Collections.swap(list,3,5 );//index 3 is swapped with index 5

        System.out.println("list = " + list);//[2, 3, 4, 7, 6, 5, 8]

    }
}
