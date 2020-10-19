package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDescending {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,4,2,3,7,6,5,9,8,0));

        Collections.sort(list);

        ArrayList<Integer> reversed = new ArrayList<>();

        for (int i = list.size()-1; i >= 0; i --){

            System.out.print(list.get(i)+" ");

            reversed.add(list.get(i));
        }

        System.out.println();

        System.out.println("reversed = " + reversed);




    }
}
