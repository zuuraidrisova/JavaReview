package day22_LoopsArrays;

import java.util.Arrays;

public class MultiD_Arrays {

    public static void main(String[] args) {

        //A multidimensional array is an array containing one or more arrays.

        //n dimensional array contains n-1 dimensional array

        //in two dimensional arrays we can put only single dimensional array
        // [] first bracket represent a single dimensional array
        // [] second bracket represent each element in a single dimensional array

        int [][] twoDarr = { {1,2,3},{4,5,6} };

        System.out.println(Arrays.deepToString(twoDarr));

        char [][] arr2D = { { 'A','B'  }, { 'C','D', 'E'  } ,{'F','G','H','J'  }  };


        for(int i = 0; i < arr2D.length; i++){

            for(int j = 0; j < arr2D[i].length; j++){

                System.out.print(arr2D[i][j]+" ");
            }

            System.out.println();
        }

        System.out.println();
    }
}
