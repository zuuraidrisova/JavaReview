package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

    public static void main(String[] args) {

      //  contains(object) ==> checks if an object is contained on list or not, returns boolean

        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("list = " + list);

        boolean bool =  list.contains("Z");//false, because Z is not in the list

        System.out.println("bool = " + bool);

        boolean bool2 =  list.contains("B");//true, because B is in the list

        System.out.println("bool2 = " + bool2);

        //equals(list1, list2) ==> checks if two lists are equal, return boolean

        ArrayList<String> list2= new ArrayList<>();

        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");

       boolean bool3 =  list.equals(list2);//true, because two lists are similar

        System.out.println("bool3 = " + bool3);


       // Arrays.equals(arr1, arr2)

        int arr1 [] = {3,2,1};
        int arr2 [] = {1,2,3};

        boolean bool4 = Arrays.equals(arr1,arr2);//false because before sorting they are not equal

        System.out.println("bool4 = " + bool4);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean bool5 = Arrays.equals(arr1,arr2);//true because after sorting they are equal

        System.out.println("bool5 = " + bool5);

        /*
        Data Structures:
            Array ==> utility class is Arrays (java.util)
            Collection ==> utility class is Collections (java.util)
            Maps
         */


        ArrayList<String> list3= new ArrayList<>();

        list3.add("C");
        list3.add("A");
        list3.add("B");
        list3.add("D");

        ArrayList<String> list4= new ArrayList<>();

        list4.add("A");
        list4.add("B");
        list4.add("C");
        list4.add("D");

        boolean result = list3.equals(list4); //false, because not sorted

        System.out.println("result = " + result);

        Collections.sort(list3);
        Collections.sort(list4);

        boolean result1 = list3.equals(list4);//true, because after sorting they are equal

        System.out.println("result1 = " + result1);

        //isEmpty() ==> checks if list is empty or not, returns boolean

       boolean result3 =  list3.isEmpty();//false because list is not empty

        System.out.println("result3 = " + result3);


    }
}
