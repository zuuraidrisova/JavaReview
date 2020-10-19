package day22_LoopsArrays;

import java.util.Arrays;

public class NestedLoop {

    public static void main(String[] args) {

        int [][] numbers = { {9,8,7 } , {6} ,{5,4,3,2,1,0 } };

        for (int i = 0; i < numbers.length; i++){


            for(int j = 0; j < numbers[i].length; j++){

                System.out.print(numbers[i][j]+" ");
            }

            System.out.println();

        }

        System.out.println("======================================");
        //reverse the single dimensional array inside two-dimensional array


        for(int i = 0; i < numbers.length; i++){ //i is an index number of  single dimensional array

            for(int j = numbers[i].length-1; j >= 0; j --){ // j is an index number of elements in a single dimensional array

                System.out.print(numbers[i][j]+" ");
            }

            System.out.println();
        }

        System.out.println("=======================");
        //reverse 2 dimensional array

        for (int i = numbers.length -1; i >= 0; i--){

            for(int j = numbers[i].length-1; j >= 0; j--){

                System.out.print(numbers[i][j]+" ");
            }
        }

        System.out.println("=======================");

        //count odd and even numbers in 2D-array

        int[][] number = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };

        int countOdd = 0;
        int sumOdd = 0;
        int countEven = 0;
        int sumEven = 0;

        for(int i = 0; i < number.length; i++){

            for (int j = 0; j < number[i].length; j++){

                if(number[i][j] % 2 == 0){

                    countEven++;

                    sumEven += number[i][j];

                }else{

                    countOdd++;
                    sumOdd += number[i][j];
                }
            }
        }


        System.out.println("countEven = " + countEven);
        System.out.println("sumEven = " + sumEven);
        System.out.println("countOdd = " + countOdd);
        System.out.println("sumOdd = " + sumOdd);


    }
}
