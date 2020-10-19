package day44_Exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        try{

            System.out.println(9 / 0 );
            System.out.println("try block");

        }catch (ArithmeticException e){

            //everytime unchecked block occurred then catch block will get executed
            System.out.println("cannot be divided by zero");
            System.out.println("catch block");

        }finally {//it gets executed whether exception is handled or not handled

            //finally block will get executed no matter what
            System.out.println("finally block");
        }


    }
}
