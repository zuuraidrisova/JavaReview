package day15_ForLoop;

public class Loops {

    public static void main(String[] args) {

        //Loops: are used to repeat the same actions multiple times
        /*
        for( initialization; condition; iterator){

                Statements;

        }
        initialization: it is starting point
        condition: defines the condition for the loop to run
        iterator: is used to stop the loop at some point

         */

        for(int i = 0; i < 10; i++){

            System.out.println("Hello Zuura");
        }

        for(int i = 1; i  <= 10; i +=2){ //1,3,5,7,9

            System.out.println(i);
        }

        for(int i = 1; i  <= 10; i +=2){ //1,3,5,7,9

            System.out.println(i +" : "+ (i * i));//square root
        }

        //odd number between 1 - 100 in a single line by comma

        for(int i = 1; i <= 100; i++){

            if(i % 2 != 0){

                System.out.print(i+", ");
            }
        }

        System.out.println();

        //even number between 1 - 100 in a single line by comma

        for(int i = 0; i <= 100; i++){

            if(i % 2 == 0){

                System.out.print(i+", ");
            }
        }

    }
}
