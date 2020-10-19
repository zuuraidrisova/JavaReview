package day32_Predicate_SimpleLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveZerosToBack {

    public static void main(String[] args) {
/*
Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1,0,2,0,3,0,4,0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT declare  any extra lists

 */
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        System.out.println("list = " + list);

        int countZeros = 0;

        for (int i = 0; i < list.size(); i++){

            if(list.get(i) == 0){

                countZeros++;
            }
        }

        list.removeAll(Arrays.asList(0));

        for (int i = 0; i < countZeros; i++){

            list.add(0);
        }

        System.out.println("list = " + list);

        System.out.println("===========================================");

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        System.out.println("list2 = " + list2);

        int countZeros2 = Collections.frequency(list2,0);

        list2.removeAll(Arrays.asList(0));

        for (int i = 0; i < countZeros2; i++){

            list2.add(0);
        }

        System.out.println("list2 = " + list2);





    }
}
