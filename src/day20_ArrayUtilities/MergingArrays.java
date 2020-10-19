package day20_ArrayUtilities;

import java.util.Arrays;

public class MergingArrays {

    public static void main(String[] args) {

        /* write a program that can combine two arrays of any lengths, and return the third array
      arr1 ==> [1,2,3];
      arr2 ==> [4,5,6,7];
      arr3 ==> [1,2,3,4,5,6,7]
       */
        int [] arr1 = {1,2,3}; //first array
        int [] arr2 = {4,5,6,7};//second array

        int [] merged = new int[arr1.length + arr2.length]; //now third array has enough room to store both arrays

        for (int i = 0; i < arr1.length; i++){ //loop thru first array

            merged[i] = arr1[i]; // and put it ot third array

        }

        for (int k = 0; k < arr2.length; k++){ //loop thur second array

            merged[arr1.length + k] = arr2 [k]; //and store them into third array starting at the point we stopped

        }

        System.out.println(Arrays.toString(merged));

    }
}
