package day30_ArrayList;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElementsFromArrayList {
    /*
     3.  write a program that can find the unique elements
         from an ArrayList of integers and stores into another list called uniques

        ex: list==> {1,1,2,3,3,4,5}
        uniques ==> {2,4,5}
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,3,3,4,5));

        System.out.println("list = " + list);

        ArrayList<Integer> uniques = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){

            int count = 0;

            for (int j = 0; j < list.size(); j++){

                if(list.get(i) == list.get(j)){

                    count++;
                }
            }

            if(count == 1){

                uniques.add(list.get(i));
            }
        }


        System.out.println("uniques = " + uniques);

       ArrayList<Integer> uniques2 = uniquesFromArrayList(list);

        System.out.println("uniques2 = " + uniques2);

    }


    public static ArrayList<Integer> uniquesFromArrayList(ArrayList<Integer> list){

        ArrayList<Integer> uniques = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){

            int count = 0;

            for (int j = 0; j < list.size(); j++){

                if(list.get(i) == list.get(j)){

                    count++;
                }
            }

            if(count == 1){

                uniques.add(list.get(i));
            }
        }


       return  uniques;


    }

}
