package day16_BreakContinueLoops;

public class sum {
    public static void main(String[] args) {


        //write a program that can sum all the odd numbers between 1- 100 that can be divided by 3 and 5

        int sumOdd = 0;

        for (int i = 1; i <= 100; i++) {

            if(i % 2 != 0 ){

                if( i % 3 == 0 && i % 5 == 0){

                    sumOdd += i;
                }
            }
        }

        System.out.println("sumOdd = " + sumOdd);

        //write a program that can sum all the even numbers between 1- 100 that can be divided by 3 and 5

        int sumEven= 0;

        for(int i = 0; i <= 100; i++ ){

            if(i % 2 == 0){

                if( i % 3 == 0  && i % 5 == 0){

                    sumEven += i;
                }
            }
        }

        System.out.println("sumEven = " + sumEven);

    }
}
