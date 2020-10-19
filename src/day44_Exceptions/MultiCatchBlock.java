package day44_Exceptions;

import java.util.NoSuchElementException;

public class MultiCatchBlock {

    public static void main(String[] args) {

        // u can give as many catch blocks as u want, but only one will get executed

        try{// it will try to fix, if not it will jump to first catch block

            System.out.println(100 / 0);

        }catch (ClassCastException e){ //it will try to handle the exception,
                        // if not, it will send to the next catch block

            System.out.println("Class Cast Exception");

        }catch (ArithmeticException e){//it will come here, and it should handle it

            System.out.println("Arithmetic exception");

        }catch (IndexOutOfBoundsException e){
            // it will not come here, because previous catch  handled the exception

            System.out.println("Index out Of bound");

        }catch (RuntimeException e){//top to bottom, so even if it can handle ,
            // it will not be executed since it has already been caught

    //parent exception cannot come before child exception, it should always come after

            System.out.println("Runtime exception");

        }

        System.out.println("=========================");


        try{

            System.out.println("Hello");// everything is good here, so it will be printed
            System.out.println(100 / 0);//here it goes to catch block
            System.out.println("Cybertek");
            System.out.println("Welcome");

        }catch(Exception e){

            System.out.println("Something went wrong");

        }


    }
}
