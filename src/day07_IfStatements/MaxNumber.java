package day07_IfStatements;

public class MaxNumber {

    public static void main(String[] args) {
        /*
        Use if to specify a block of code to be executed, if a specified condition is true
        Use else to specify a block of code to be executed, if the same condition is false
        Use else if to specify a new condition to test, if the first condition is false
         */

        //write a program that accepts 3 numbers and return the max of them

        int a = 10;
        int b =  23;
        int c = 89;

        if(a > b && a > c){

            System.out.println("Max number is: "+ a);

        }else if( b > a && b > c){

            System.out.println("Max number is: "+b);

        }else{

            System.out.println("Max number is: "+c);
        }



        boolean aGreater = a > b && a > c;
        boolean bGreater = b > a && b > c;
        boolean cGreater = c > a && c > b;


        if(aGreater){

            System.out.println("aGreater = " + aGreater);
        }

        if (bGreater){

            System.out.println("bGreater = " + bGreater);
        }

        if (cGreater){

            System.out.println("cGreater = " + cGreater);
        }


    }
}
