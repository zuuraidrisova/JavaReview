package day20_ArrayUtilities;

import java.util.Arrays;

public class ArraysUtilities {

    public static void main(String[] args) {

        //Arrays is a class, presented in jav.util package, stores useful methods
        // to manipulate with an array, we have to import the class to be able to use its methods

       // Arrays.toString = prints an array as a string

        int [] arr2 = {4,5,6,7};

        System.out.println(Arrays.toString(arr2));

        int [] arr = {4,5,6,7,13,23,9,43,321};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int minNum =arr[0];
        int maxNum = arr[arr.length-1];

        System.out.println("minNum = " + minNum);
        System.out.println("maxNum = " + maxNum);


        int [] a = {3,2,1};
        int [] b = {1,3,2};

        boolean equal1 = Arrays.equals(a,b);

        System.out.println("equal1 = " + equal1);//false, because not sorted

        Arrays.sort(a); //sort first array in ascending order
        Arrays.sort(b); // sort second array in ascending order

        boolean equal = Arrays.equals(a,b); //comparing now

        System.out.println("equal = " + equal); //true because we already sorted


        char[] ch = {'z','d','e','r','f','o'};
        Arrays.sort(ch); //sorts characters according to ASCII table

        System.out.println(Arrays.toString(ch));

        String [] names =  {"Sary", "Asan","Alina","Zuura"};

        System.out.println("before sorting " + Arrays.toString(names));

        Arrays.sort(names);

        System.out.println("after sorting " + Arrays.toString(names));


        System.out.println("======================================");

        //store in a new array in descending order after sorting

        int [] before = {4,5,6,7,13,23,9,43,321};

        Arrays.sort(before);

        int after [] = new int[before.length];

        int j = 0;

        for (int i = before.length-1; i >= 0; i--){

            after[j] = before[i];

            j++;
        }

        System.out.println(Arrays.toString(after));




    }
}
