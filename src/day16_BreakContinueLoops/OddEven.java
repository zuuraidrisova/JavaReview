package day16_BreakContinueLoops;

public class OddEven {

    public static void main(String[] args) {

        //write a program that can print all the odd numbers between 1- 100 that can be divided by 3 and 5

        for(int i = 1; i <= 100; i++){

            if(i % 2 != 0){

                if(i % 3 == 0 && i % 5 == 0){

                    System.out.print(i +", ");
                }

            }

        }

        System.out.println();
        //write a program that can print all the even numbers between 1- 100 that can be divided by 3 and 5

        for(int i = 1; i <= 100; i ++){

            if(i % 2 == 0){

                if(i % 3 == 0 && i % 5 == 0){

                    System.out.print(i +", ");
                }
            }
        }

        System.out.println();



    }
}
