package day29_WrapperClass_ArrayList;

public class Autoboxing_Unboxing {

    public static void main(String[] args) {

        /*
        both of them are done automatically:

        Autoboxing -->  assigning primitive data types to their own wrapper classes
                        converting primitives to objects

        Unboxing -->  converting objects into primitive data types

         */

        int a = 100; //primitive

        Integer b = a; //object (behind the scenes, autoboxing is happening)
                        // converting primitives to objects

        Byte byte1 = 98;

        short short1 = byte1; //unboxing is happening, converting wrapper class to primitives




    }
}
