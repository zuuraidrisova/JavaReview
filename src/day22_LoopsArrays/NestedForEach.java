package day22_LoopsArrays;

public class NestedForEach {

    public static void main(String[] args) {

        //count odd and even numbers in 2D-array using nested for each loop

        int[][] number = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };

        int countOdd = 0;
        int sumOdd = 0;
        int countEven = 0;
        int sumEven = 0;

        for(int [] eachSingleD :  number){

            for (int eachElement : eachSingleD ){

                if(eachElement % 2 == 0){

                    countEven++;
                    sumEven += eachElement;

                }else{

                    countOdd++;
                    sumOdd += eachElement;
                }
            }
        }


        System.out.println("countEven = " + countEven);
        System.out.println("sumEven = " + sumEven);
        System.out.println("countOdd = " + countOdd);
        System.out.println("sumOdd = " + sumOdd);


        System.out.println("=================================");

        char [] [] ch2D = {{'a', 'b', 'c','d'},{'e','f','g','h','k'} };

        for(char [] eachArray : ch2D){

            for(char eachElement : eachArray){

                System.out.print(eachElement+" ");
            }
        }


        System.out.println();

    }
}
