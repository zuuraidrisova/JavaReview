package day29_WrapperClass_ArrayList;

public class WrapperClassPractice {

    public static void main(String[] args) {

        double [] array = {1.1,8.9,3.4,-10.0, 3.6};

        double maxValue = Double.MIN_VALUE;

        for (double each :  array){

            if(maxValue < each){

                maxValue = each;
            }
        }

        System.out.println("maxValue = " + maxValue);

        System.out.println("====================================");

        String [] array2 = {"1.1","8.9","3.4","-10.0", "3.6"};

        double maxValue2 = Double.MIN_VALUE;

        for(String each : array2){

            double value = Double.valueOf(each);

            if(value > maxValue2){

                maxValue2 = value;
            }
        }

        System.out.println("maxValue2 = " + maxValue2);

    }
}
