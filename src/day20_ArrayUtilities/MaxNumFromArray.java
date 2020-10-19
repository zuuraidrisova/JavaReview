package day20_ArrayUtilities;

public class MaxNumFromArray {

    public static void main(String[] args) {

        int [] arr = {34,90,1,-10,378,4873};

        int maxNum = Integer.MIN_VALUE;


        for(int i = 0; i < arr.length; i++){

            if(arr[i] > maxNum){

                maxNum = arr[i];
            }
        }

        System.out.println("maxNum = " + maxNum);

        System.out.println("===================================");

        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.length-1; i++){

            if(minNum > arr[i]){

                minNum = arr[i];

            }
        }

        System.out.println("minNum = " + minNum);


    }
}
