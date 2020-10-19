package day22_LoopsArrays;

import java.util.Arrays;

public class CreateAssignArray {

    public static void main(String[] args) {

        /*
           1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to print out all the even numbers.
                MUst use continue statement
         */

        int [] numbers = new int [100];

        for (int i = 0; i < numbers.length; i++){

            numbers[i] = i+1;

        }

        System.out.println(Arrays.toString(numbers));

        for (int each : numbers){

            if(each % 2 != 0){

                continue;
            }

            System.out.print(each+" ");
        }

        System.out.println();

    }
}
