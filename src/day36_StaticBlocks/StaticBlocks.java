package day36_StaticBlocks;

public class StaticBlocks {

    /*

    Static blocks are mainly used to initialize static variables
    Static blocks are run only once and before anything else in the class, even before main method

            static {
                    statements();
                 }
     */

    public static void main(String[] args) {

        System.out.println("Main method");

        customMethod();
    }

    public static  void customMethod(){

        System.out.println("Custom Method");
    }

    static {

        System.out.println("Static Block");
    }

    static int a;
    static int b;

    static {

        a = 100;
        b = 200;
    }

}
