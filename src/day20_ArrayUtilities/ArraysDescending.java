package day20_ArrayUtilities;

import java.util.Arrays;

public class ArraysDescending {

    public static void main(String[] args) {

        String [] months = {"January","February", "March", "April", "May", "June", "July"
                ,"August", "September", "October", "November", "December"};


        for (int i = months.length-1; i >= 0; i--){

            System.out.println(months[i]);
        }



    }
}
