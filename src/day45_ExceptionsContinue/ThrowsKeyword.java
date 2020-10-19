package day45_ExceptionsContinue;

public class ThrowsKeyword {

    /*

   throws:
       used to indicate that method is going to throw some kind of exception

       it is another way(shorter cheaper way)of handling checked exception, only Checked

       throws ==> means that method throws an exception, must be used in method signature

       but, when we want to use that method we need to handle it every single time

       the caller of the  method is resposible again to handle exception
        by using throws keyword
    */

    public static void sleep1 () throws InterruptedException {

        // throws is cheaper way to get rid of exception
        Thread.sleep(2000);

    }

    public static void sleep2(){

        try {
            Thread.sleep(2000);
            //try catch is one way to handle Thread.sleep() methods exception

        } catch (InterruptedException e) {

        }

    }


    public static  void sleep3() throws Exception{

        //the caller must always handle that exception again
        Thread.sleep(2000);

        /*
        it means every time when we use a method which throws the exception
         we need to specify throws keyword again
         you need to handle it anywhere you use it. throws doesn’t really handle it,
          it just allows you to compile
         */

    }



    //throws is used again in order to handle exception
    public static void main(String[] args) throws Exception{


        System.out.println("Cybertek");

        sleep1();

        System.out.println("Hello");
    }


    public void method() throws Exception{

        String [] arr = {"a"};

        main(arr);//we called main method, we need to handle the exception again

    }
}
