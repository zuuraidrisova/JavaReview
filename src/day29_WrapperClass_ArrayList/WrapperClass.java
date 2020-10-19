package day29_WrapperClass_ArrayList;

public class WrapperClass {
    /*

    ALL wrapper classes are presented in java.lang package, no need to import

    Wrapper classes provide a way to use primitive data types (int, boolean,) as objects.

          Primitive Data Type	        Wrapper Class
                byte	                    Byte
                short	                    Short
                int	                        Integer
                long	                    Long
                float                   	Float
                double                  	Double
                boolean	                    Boolean
                char	                    Character


      Sometimes you must use wrapper classes, for example when working with Collection objects,
       such as ArrayList, where primitive types cannot be used.

       To create a wrapper object, use the wrapper class instead of the primitive type.

       ex:   Integer myInt = 5;
             Double myDouble = 5.99;
             Character myChar = 'A';

        Since you're now working with objects, you can use certain methods to get
         information about the specific object.

         Another useful method is the toString() method, which is used to convert wrapper objects to strings.

        wrapper classes have useful methods:

        parse methods:
                converts string of text into primitive types

        valueOf methods:
                converts string of text into wrapper class


     */

    public static void main(String[] args) {

        int a = 100;//primitive data type of int

        Integer b = a; //wrapper class of int

        short s1 = 200;//primitive data type of short

        int n = s1;

        //  Integer c = s1;// compiler error because Integer is only for int data type

        Integer n2 = n;//compiles bcs Integer  is only for int

        int a1 = 20;

        float f1 = a1;

        // Float f2 = a1; Float does not accept int, Float accepts only float

        Integer i = 200;

        int a2 = i;

        Byte b1 = 127;

        int a3 = b1;//Byte wrapper class can be assigned to any larger primitive data type

        System.out.println(a3);
    }



}
