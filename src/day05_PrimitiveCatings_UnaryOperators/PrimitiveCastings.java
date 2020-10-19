package day05_PrimitiveCatings_UnaryOperators;

public class PrimitiveCastings{

    public static void main(String[] args) {

        /*
        Casting is converting one data type into another

        Implicit Casting: casting smaller primitives to larger ones, done automatically by compiler
        Explicit Casting: casting larger primitives to smaller ones, done manually

        Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double

        Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte

         */

        int a = 10;
        long b = a; //implicit casting is done automatically

        int a1 = 100;
        long b1 = (long) a1; //but i u insist u can do implicit casting manually by providing data type in parenthesis

        //int c = b; // compile error because b is long and it is larger than int

        int a2 = 100;
        byte b3 = (byte)a2;
        //explicit casting is done manually by pointing to the data type which is same size or smaller size

        short s = (short) a2;

        double d = 5.5;

        float f = (float)d; // if u dont cast it , it is not gonna compile // 5.5

        float f1 = (int) d; // 5.0

        System.out.println("f = " + f);
        System.out.println("f1 = " + f1);


        double d1 = 10.5;
        long l = (long) d1; //now it is just 10 with no decimals because we casted it to long whole number

        System.out.println("l = " + l);

        float f2 = 60.5f;
        int h = (int) f2;//int java casting to the same data type is preferred

        System.out.println("h = " + h); // now 60.5 becomes just 6o whole number bcs casting to int


        char ch1 = 'a';

        short sh = (short)ch1;


    }


}
