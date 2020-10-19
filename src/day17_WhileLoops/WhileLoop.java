package day17_WhileLoops;

public class WhileLoop {

    public static void main(String[] args) {

        /*
    The while loop loops through a block of code as long as a specified condition is true:
        while loop is repeated If statement
         */

        if(10 > 9){ //condition is true, so below statement will print once

            System.out.println("Hello");
        }

     /*


        while(10 > 9){//condition is true, so below statement will print forever

            System.out.println("Hello");
        }

    */

        int i = 0;

        while(i <= 5){

            System.out.println(i);

            i++;
        }


        for (int k = 0; k <= 5; k ++){

            System.out.println(k);

        }



    }
}
