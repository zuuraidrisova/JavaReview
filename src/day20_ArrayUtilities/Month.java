package day20_ArrayUtilities;

import java.util.Arrays;
import java.util.Scanner;

public class Month {

    public static void main(String[] args) {

        String [] month = new String [12];

        Scanner scan = new Scanner(System.in);

        int j = 1;

        for(int i = 1; i <= 12; i++){

            System.out.println("Enter a month: "+ i);
            month[j] = scan.next();

            j++;
        }


        System.out.println(Arrays.toString(month));



    }
}
