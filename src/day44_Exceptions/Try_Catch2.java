package day44_Exceptions;

public class Try_Catch2 {

    public static void main(String[] args) {

        System.out.println("Test started");

        try {

            Thread.sleep(3000);
            System.out.println("Try block"); //try block could handle the exception
            //if try block message is executed it means try block was able to fix it

        }catch(InterruptedException e){ // we can also give Exception which is a parent of all

            System.out.println("Catch block");
            //if this statement gets executed then try block was not able
            // to handle it, so it jumped to catch block
        }

        System.out.println("Test completed");


        //all checked exceptions are handled by try block
        //all unchecked exceptions are handled by catch block

    }
}
