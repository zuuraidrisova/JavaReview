package day22_LoopsArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerArrays {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] names = new String[5];

        for (int i = 0; i < names.length; i++){

            System.out.println("Please enter name: "+ (i+1));
            names[i] = scan.next();

        }

        System.out.println(Arrays.toString(names));

        for (String each : names){

            String first = each.substring(0,3);

            System.out.println("first = " + first);
        }


    }
}
