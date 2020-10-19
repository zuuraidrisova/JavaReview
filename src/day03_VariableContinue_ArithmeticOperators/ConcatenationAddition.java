package day03_VariableContinue_ArithmeticOperators;

public class ConcatenationAddition {

    public static void main(String[] args) {

        /*

        number + number = addition
        text +  number = concatenation
        number +  text =  concatenation
        text +  text = concatenation

         */

        /*

        Primitives: char and boolean

        boolean : expression that evaluates to true or false

                10 > 9 ==> true

                boolean result = 10 > 7;

        Comparison operators:  return boolean value
                >   greater than
                <   less than
                >=  greater than or equal to
                <=  less than or equal to
                ==  equal to
                !=  not equal to




        char: single character , declared using single quotes ' '

                they are also called unicode from ASCII table

                every single character has its own corresponding numbers

                ASCII table is an alphabet of computer language, all computers undertand it

                char ch1 = 'A';




         */

        boolean result1 = true;
        boolean result2 = false;

        boolean result3 = 10 > 9 ; //true

        System.out.println("result3 = " + result3);

        boolean result4 = 9 >= 9;//true

        System.out.println("result4 = " + result4);

        boolean result5 = 10 != 10;//false

        System.out.println("result5 = " + result5);

        System.out.println(true == false); //false

        System.out.println("Zuura" != "Good Girl"); //true


        char ch1 = 'A';

        System.out.println("ch1 = " + ch1);

        char ch2 = 45000;

        System.out.println("ch2 = " + ch2);

        char ch3 = 25000;

        System.out.println("ch3 = " + ch3);

        char ch4 = 100; //it is gonna print d because d has corresponding number of 100

        System.out.println("ch4 = " + ch4);

        int num1 = 'D'; //it is gonna print D's corresponding number

        System.out.println("num1 = " + num1); //68

        char a1 = 'z'; //

        // byte b1 = a1; char is larger than byte
        // short s1 = a1; char is larger than short
        int i1 = a1; //int is large enough to contain char

        byte b1 = 'z';

        System.out.println("a1 = " + a1);
        System.out.println("b1 = " + b1);



    }

}
