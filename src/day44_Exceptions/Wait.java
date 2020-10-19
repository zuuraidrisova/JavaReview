package day44_Exceptions;

public class Wait {

    /*
     Write a method called "wait" that causes the current executing thread to sleep
     for the specific number of seconds
     parameters: double seconds
     */

    public static void wait(double seconds){

        long sec = (long)seconds;

        try{

            Thread.sleep(sec * 1000);
            // because sleep method need long parameter, and 1 sec is equal to 1000 millisec

        }catch (InterruptedException e){


        }
    }


    public static void main(String[] args) {

        System.out.println("Hello");

        wait(3.3);

        System.out.println("Cybertek");

        wait(3.3);

        System.out.println("Welcome");


    }
}
