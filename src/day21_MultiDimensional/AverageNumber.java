package day21_MultiDimensional;

public class AverageNumber {

    public static void main(String[] args) {

        int arr [] = {1,2,3,4,5,6,7,8,9};

        int sum = 0;

        int count = 0;

        for (int i = 0; i < arr.length; i++){

            sum += arr[i];

            count++;

        }

        System.out.println("Average number is: "+ (sum/count));

    }
}
