package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        /*

      All these methods are bulk operations, they expect collection type

      Arrays.asList is a collection type, it is a method which allows multiple elements

        addAll(collection type) ==> add multiple objects to list
        contains(collection type) ==> check if multiple objects are contained in the list
        removeAll(collection type) ==> remove multiple objects from list  at once
        retainAll(collection type) ==> keeps multiple objects in the list
         */

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10,20,30,40,50));

        boolean result = list.containsAll(Arrays.asList(10,50));//true because list has 10,50

        System.out.println("result = " + result);

        int [] arr1 = {1,2,3,4,5};

        Integer [] arr2 = {1,2,3,4,5};

        ArrayList<Integer> list2 = new ArrayList<>();

       // list2.addAll(arr1);this is not gonna compile because array
        // is declared  with primitive type and arrayList does not accept primitives

        list2.addAll(Arrays.asList(arr2));//this compiles, because array is of object type:Integer

        System.out.println("======================================");

        ArrayList<String> nameList = new ArrayList<>();

        String [] names = {"Murtaza","Muhtar","Muhesong","Sada","Rustem"};

        nameList.addAll(Arrays.asList(names));

        System.out.println("nameList = " + nameList);

        System.out.println("======================================");

        // we can pass all values to the constructor
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,1,2,3,4,5));

        System.out.println("list1 = " + list1);

        list1.removeAll(Arrays.asList(1,5)); //removes all matching ones

        System.out.println("list1 = " + list1);

        System.out.println("======================================");

        String names2 [] = {"Ahmed","Ahmed", "Muhtar","Muhesong","Sada","Ahmed"};

        ArrayList<String> employees = new ArrayList<>(Arrays.asList(names2));

        System.out.println("employees = " + employees);

        employees.removeAll(Arrays.asList("Ahmed"));//will remove all matching ones

        System.out.println("employees = " + employees);

        System.out.println("======================================");

        ArrayList<Integer> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4));

        System.out.println(list3);

        list3.retainAll(Arrays.asList(1,2,3,4));// ==> retain all these inside matching

        System.out.println(list3);

    }
}
