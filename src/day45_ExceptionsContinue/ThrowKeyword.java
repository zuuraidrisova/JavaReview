package day45_ExceptionsContinue;

import java.io.IOException;
import java.util.NoSuchElementException;

public class ThrowKeyword {

    public static void main(String[] args) {

         /*
    throw :  manually throwing the exception

            throw new ExceptionClass();

            creating a problem by us
     */


        int [] arr = {1,2,3,4};

     //  System.out.println(arr[100]);//unchecked exception, runtime

        // NoSuchElementException obj = new NoSuchElementException();
        //because we dont want to reuse anything, we can throw exception right away

       // throw new NoSuchElementException();// manually simulating an exception

        //anything comes after throw keyword cannot be executed, exception is there



        try {

            throw new IOException("please take break");

        }catch (IOException io){

        }

    }
}
