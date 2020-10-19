package day20_ArrayUtilities;

import java.util.Arrays;
import java.util.Scanner;

public class FillArray {

    public static void main(String[] args) {

        int arr [] = new int[5];

        Scanner scan = new Scanner(System.in);

        int j = 0;

        for(int i = 0; i < arr.length; i++){

            arr[j] = scan.nextInt();

            j++;
        }

        System.out.println(Arrays.toString(arr));





    }
}
