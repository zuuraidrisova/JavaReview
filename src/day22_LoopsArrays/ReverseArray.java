package day22_LoopsArrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        //reverse array

        int array [] = {1,2,3,4,5,6,7,8,9};

        for (int i = array.length-1; i >= 0; i--){

            int each = array[i];

            System.out.println("each = " + each);

        }

        /*
        int [] arr = {1,2,3,4,5,6,7,8,9};

        int k = 0;

        for (int i = arr.length-1; i >= 0; i --){

            arr[k] = arr[i];

            k++;
        }

        System.out.println(Arrays.toString(arr));

         */

        //reverse array and put it in a new array


        int [] arr2 = {1,2,3,4,5,6,7,8,9};

        int [] arr3 = new int[arr2.length];

        int z = 0;

        for (int i = arr2.length-1; i >= 0; i --){

            arr3[z] = arr2[i];

            z++;
        }

        System.out.println(Arrays.toString(arr3));



    }
}
