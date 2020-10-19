package day05_PrimitiveCatings_UnaryOperators;

public class UnaryOperators {

    public static void main(String[] args) {

       // Arithmetic Operators: + , -, /, *, % used to perform mathematical operations

        //Comparison Operators: >, < , ==, !=, <= , >= used to compare two values

        //Assignment Operators: = is used to assign a value to a variable

        //Unary Operators:  +, -, --, ++, !
             //   +  indicates a positive number
            //   -   indicates a negative number
            //   --  decrement , decreases value by one
           //    ++  increment, increases value by one

        int a = 10;
        int b = +a; //+ shows a positive number, be default it is positive  so no need to explicitly show

        int a2 = -10;
        boolean result = a2 > 0; //false

        System.out.println("result = " + result);

        int x1 = -10;
        int y1 = -x1;
         // two negatives make positive
        System.out.println("y1 = " + y1);


        /*
        two types of increment / decrement:

        post: increase/decrease value not immediately

        pre: increase/decrease value  immediately

         */

        //pre
        int z = 100;

        System.out.println("z = " + --z); //decrease value immediately
        System.out.println("z = " + ++z); // increase value immediately

        //post

        int m = 100;

        System.out.println("m = " + m--); //decrease value after one step, so first the current value
        System.out.println("m = " + m++); //now m is 99, and next step will increase the value by one


    }
}
