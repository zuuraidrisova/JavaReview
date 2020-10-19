package day45_ExceptionsContinue;

public class ThrowsKeyword2 {

    public static void main(String[] args) throws InterruptedException{

        /*
        It’s only handled in the method it’s created in...
         if used in another method, it will need to be handled again!

         if method you want to use, giving you compile time error,
         it means throws keyword
         was used in that method's signature

         */

        System.out.println("Java");

        Thread.sleep(2000);

        System.out.println("Cybertek");

        Thread.sleep(2000);

        System.out.println("Batch 18");

        Thread.sleep(2000);

        System.out.println("Complete");

    }
}
