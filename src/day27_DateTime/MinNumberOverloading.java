package day27_DateTime;

import day07_IfStatements.MaxNumber;

public class MinNumberOverloading {

     /*
 3. write a method that can return the minimum number from an int array
4. write a method that can return the minimum number from a double array
    NOTE: MUST apply method overloading

   */

    public static void main(String[] args) {

        int [] arr = {1826,92971,28812,1028,192};

        int min = minNumber(arr);

        System.out.println("min = " + min);

        double [] arr1 = {1.2, 8.9, 10.11, 5.6};

        double min1 = minNumber(arr1);

        System.out.println("min1 = " + min1);
    }
    public static int minNumber(int array []){

        int minNumber = Integer.MAX_VALUE;

        for(int each : array){

            if(each < minNumber){

                minNumber = each;
            }
        }

        return  minNumber;

    }

    public static double minNumber(double array []){

        double minNumber = Double.MAX_VALUE;

        for(double each : array){

            if(each < minNumber){

                minNumber = each;
            }
        }

        return  minNumber;

    }
}
