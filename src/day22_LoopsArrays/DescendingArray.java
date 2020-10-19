package day22_LoopsArrays;

import java.util.Arrays;

public class DescendingArray {

    public static void main(String[] args) {

        int array [] = {1,2,3,4,5,6,7,8,9};

        Arrays.sort(array);

        for (int i = array.length-1; i >= 0; i--){

            System.out.print(array[i]+" ");
        }

        System.out.println();


        int reversed [] = new int[array.length];

        int k = 0;

        for (int i = array.length-1; i >= 0; i --){

            reversed[k] = array[i];

            k++;
        }

        System.out.println(Arrays.toString(reversed));





    }
}
