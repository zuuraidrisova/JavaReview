package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesFromArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,1,1,2,3,4,5,5,6,7,5));

        System.out.println("list = " + list);

        ArrayList<Integer> noDup =  removeDuplicatesFRomArrayList(list);

        System.out.println("noDup = " + noDup);

    }
    public static ArrayList<Integer> removeDuplicatesFRomArrayList(ArrayList<Integer> list){

        ArrayList<Integer> noDuplicates = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){

            if(!noDuplicates.contains(list.get(i))){

                noDuplicates.add(list.get(i));
            }
        }

        return  noDuplicates;
    }
}
