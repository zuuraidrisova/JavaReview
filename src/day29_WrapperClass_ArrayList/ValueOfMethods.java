package day29_WrapperClass_ArrayList;

public class ValueOfMethods {

    public static void main(String[] args) {

        //valueOf methods: converts string of text into wrapper class


        String str = "123";

        Integer i1 = Integer.valueOf(str); //will return an Integer wrapper class

        System.out.println("i1 = " + i1);

        double d = Integer.valueOf(str); //unboxing: assigning wrapper class into primitive

        String str2 = "true";

        //we can take value of string and assign it to primitive or wrapper class
        Boolean bool = Boolean.valueOf(str2);
        boolean bool2 = Boolean.valueOf(str2);

        System.out.println("bool = " + bool);
        System.out.println("bool2 = " + bool2);

        int maxNum = Integer.MAX_VALUE;

        System.out.println("maxNum = " + maxNum);

        double maxNum2 = Integer.MAX_VALUE;

        System.out.println("maxNum2 = " + maxNum2);

        int minValue = Integer.MIN_VALUE;

        System.out.println("minValue = " + minValue);

        double minValue2 = Integer.MIN_VALUE;

        System.out.println("minValue2 = " + minValue2);

        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;

        System.out.println("maxByte = " + maxByte);
        System.out.println("minByte = " + minByte);


        /*

        Wrapper class vs Primitives:

                Primitives: are accepted only by arrays
                Wrapper class: are accepted by arrays, collection, maps all

                Primitives: all have different default values
                            long, int, short, byte ==> 0
                            float, double ==> 0.0
                            boolean ==> false
                            char ==> empty space

                Wrapper Class: all default values are null
         */

    }
}
