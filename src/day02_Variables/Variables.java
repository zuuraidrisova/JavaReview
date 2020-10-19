package day02_Variables;

public class Variables {

    public static void main(String[] args) {


        /*
        Variables are containers for storing data values.
                variables make data reusable

          Syntax:

             DataType variableName = value;

        Primitive Data Types:
        Whole Numbers:    Byte -> Short -> Int -> Long
        Decimal Numbers:  Float -> Double
        Single Characters: char
        Boolean:  boolean

        double > float > long > int > short > byte

        The equal sign is used to assign values to the variable.

        All Java variables must be identified with unique names.

        These unique names are called identifiers.

        The general rules for constructing names for variables (unique identifiers) are:

            Names must be unique
            Names can contain letters, digits, underscores, and dollar signs
            Names must begin with a letter
            Names should start with a lowercase letter and it cannot contain whitespace
            Names can also begin with $ and _
            Names are case sensitive ("myVar" and "myvar" are different variables)
            Reserved words (like Java keywords, such as int or boolean) cannot be used as names

         */
        byte l = 4;

        System.out.println("l = " + l);

        byte w = 2;

        System.out.println("w = " + w);

        byte area = 8;

        System.out.println("area = " + area);

        //byte can hold up until 128

        //  whole numbers cannot hold decimal numbers !!!

        // short s =  2.4; compile error because short is whole number but 2.4 is a decimal number


        //int is preferred by compiler for whole numbers
        //double is preferred by compiler for decimal numbers

        int i =  20000;

       // int k = 99999999999999; exceeds int range, compile error

        System.out.println("i = " + i);

        long n = 9999999999999L; // we forcefully tell compiler that the number is a long, we add l or L

        System.out.println("n = " + n);

        //larger number cannot be assigned to a lower number

        // float f = 12.5d;

        System.out.println("=====================================");

        float pi = 3.14f;

        System.out.println("pi = " + pi);

        double pi2 = pi;

        System.out.println("pi2 = " + pi2);

        int a = 45;

        System.out.println("a = " + a);

        double d = a;

        System.out.println("d = " + d);



    }
}
