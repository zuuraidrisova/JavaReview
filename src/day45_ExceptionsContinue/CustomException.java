package day45_ExceptionsContinue;


class BreakTimeException extends RuntimeException {//custom unchecked exception


    public BreakTimeException(){

        super("it is break time, we should take break");
    }

    public BreakTimeException(String str){

        super(str);

    }
}


/*
   Custom Exceptions:

   how to create custom unchecked(Runtime)exception?

       a: by extending RuntimeException class

   how to create custom checked(CompileTime)exception?

       a: by extending Exception class
    */

public class CustomException {

    public static void main(String[] args) {

        boolean breakTime = true;


        if(breakTime) {

            throw new BreakTimeException("Lets have break");

        }else{

            System.out.println("Continue class");
        }

        throw  new RuntimeException("it is break time, we should take break");


    }
}
