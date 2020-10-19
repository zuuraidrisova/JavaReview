package day22_LoopsArrays;

public class OddEvenFromArray {

    public static void main(String[] args) {


        int [] arr = {1,2,3,4,5,6,7,8,9};

        int countEven = 0;
        int countOdd = 0;

        for(int each : arr){

            if(each % 2 == 0){

                countEven++;
            }else{

                countOdd++;
            }
        }

        System.out.println("countEven = " + countEven);
        System.out.println("countOdd = " + countOdd);


    }
}
