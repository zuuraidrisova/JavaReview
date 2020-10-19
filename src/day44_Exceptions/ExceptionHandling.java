package day44_Exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {

        String str = "Cybertek";

        try {

            System.out.println(str.charAt(19));

        }catch(RuntimeException e){

               String description =  e.getMessage();  //gets brief description

            System.out.println("description = " + description);
        }

        System.out.println("=================================");

        try{

            System.out.println(9 / 0);
            System.out.println("Try block");

        }catch (ArithmeticException e){

            String description =   e.getMessage();
            System.out.println("description = " + description);
            System.out.println("Catch block");

            //whenever unchecked block occurred then always catch block will run
        }


        System.out.println("Test completed");
    }
}
