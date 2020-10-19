package day27_DateTime;

import java.util.Arrays;

public class Descending_MethodOverloading {

    /*
    	5. write an int[] return method that can sort an int array in descending order
	6. write a double[] return method that can sort a double array in descending order
	7. write a char[] return method that can sort a char array in descending order
			NOTE: MUST apply method overloading
     */

    public static void main(String[] args) {

        int [] arr = {1,3,7,2,4,9,8,5,0};

        int [] desc = sortDescending(arr);

        System.out.println(Arrays.toString(desc));

        double [] arr1 = {1.0,3.0,7.0,2.0,4.0,9.0,8.0,5.0,0.0};

        double [] desc2 = sortDescending(arr1);

        System.out.println(Arrays.toString(desc2));

        char [] arr2 = {'A', 'B','E','W','T','P','L','K','H'};

        char [] arr3 = sortDescending(arr2);

        System.out.println(Arrays.toString(arr3));
    }

    public static int [] sortDescending(int [] array){

        Arrays.sort(array);

        int [] descending = new int[array.length];

        int k = array.length-1;

        for (int i = 0; i < array.length; i++){

            descending[k] = array[i];

            k--;
        }

        return descending;
    }

    public static double [] sortDescending(double [] array){

        Arrays.sort(array);
        double [] descending = new double[array.length];

        int k = array.length-1;

        for (int i = 0; i < array.length; i++){

            descending[k] = array[i];

            k--;
        }

        return descending;
    }

    public static char [] sortDescending(char [] array){

        Arrays.sort(array);

        char [] descending = new char[array.length];

        int k = array.length-1;

        for (int i = 0; i < array.length; i++){

            descending[k] = array[i];

            k--;
        }

        return descending;
    }
}
