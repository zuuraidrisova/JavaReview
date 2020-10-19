package day30_ArrayList;

import java.util.ArrayList;

public class Combine2ArraysIntoArrayList {
    /*
     4. write a program that can combine two String arrays into one arrayList
        ex:
        arr1 = {"A", "B", "C"};
        arr2 = {"D", "E", "F", "G"};
        list ==> {"A", "B", "C", "D", "E", "F", "G"}
     */

    public static void main(String[] args) {

        String [] arr1 = {"A", "B", "C"};
        String [] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++){

            list.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++){

            list.add(arr2[i]);
        }


        System.out.println("list = " + list);

        ArrayList<String> combined = combineTwoArraysIntoArrayList(arr1, arr2);

        System.out.println("combined = " + combined);
    }




    public static ArrayList<String> combineTwoArraysIntoArrayList(String [] arr1, String [] arr2){

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++){

            list.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++){

            list.add(arr2[i]);
        }

        return  list;
    }
}
