package day27_DateTime;

public class MaxNumberOverloading {

    /*
    1. write a method that can return the maximum number from an int array
	2. write a method that can return the maximum number from a double array
			NOTE: MUST apply method overloading


     */

    public static void main(String[] args) {

        int [] arr = {1826,92971,28812,1028,192};

        int max = maxNumber(arr);

        System.out.println(max);

        double [] arr1 = {1.2, 8.9, 10.11, 5.6};

        double max2 = maxNumber(arr1);

        System.out.println(max2);
    }

    public static int maxNumber(int [] array){

        int maxNumber = Integer.MIN_VALUE;

        for ( int each :  array){

            if(each > maxNumber){

                maxNumber = each;
            }
        }

        return  maxNumber;
    }

    public static double maxNumber(double [] array){

        double maxNumber = Double.MIN_VALUE;

        for ( double each :  array){

            if(each > maxNumber){

                maxNumber = each;
            }
        }

        return  maxNumber;
    }
}
