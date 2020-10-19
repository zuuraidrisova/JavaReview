package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class UniquesArrayList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.addAll(Arrays.asList("Hello","Thanks","Sorry","Nice","Please","Please","Nice"));

        System.out.println("list = " + list);

        ArrayList<String> noDuplicates = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){

            int count = 0;

            for (int j = 0; j < list.size(); j++){

                if(list.get(i).equals(list.get(j))){

                    count++;
                }
            }

            if (count == 1){

                noDuplicates.add(list.get(i));

            }
        }

        System.out.println("noDuplicates = " + noDuplicates);

       ArrayList<String> noDup =  uniquesFromArrayListOfStrings(list);

        System.out.println("noDup = " + noDup);

    }

    public static ArrayList<String> uniquesFromArrayListOfStrings(ArrayList<String> list){

        ArrayList<String> uniques= new ArrayList<>();

        for (int i = 0; i < list.size(); i++){

            int count = 0;

            for (int j = 0; j < list.size(); j++){

                if(list.get(i).equals(list.get(j))){

                    count++;
                }
            }

            if (count == 1){

                uniques.add(list.get(i));

            }
        }

        return  uniques;

    }
}
