package day21_MultiDimensional;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        //MultiDimensionalArray ==> array that contains another array

        int [] singleD = {1,2,3};

        int [] [] arr2D = {{1,2,3},  {4,5,6,7} };

        int num1 = arr2D[1][3];

        System.out.println(num1);


        char ch [] [] = { {'A','B','C'}, {'D','E','F'}, {'G','H','I'} };

        System.out.println(Arrays.deepToString(ch));

    }
}
