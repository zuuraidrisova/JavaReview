package day44_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class Try_Catch {

    public static void main(String[] args) {

        System.out.println("Test started");

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));


        try{

    //now try block will try to handle it, if it cannot, the catch block will assist it
            System.out.println("list.get(10) = " + list.get(10));

        }catch (IndexOutOfBoundsException indexException){
                // we can give all these three:
            //Exception ==> RuntimeException ==> IndexOutOfBoundsException
            //grandpa           dad                     son

    //parent exception cannot come before child exception, it should always come after

            System.out.println("Smth went wrong");

        }

        // if you do not handle the exception, then below code will not run
        System.out.println("Test completed");


    }
}
