package day44_Exceptions;

public class UncheckedException {

    public static void main(String[] args) {

       // System.out.println(9 / 0); //runtime exception ==>Arithmetic exception

        String str = "Cybertek";

        System.out.println(str.charAt(-1));//StringIndexOutOfBoundsException
        //index out of range exception

        System.out.println("test completed");
        //we have to handle the exception so remaining code will get executed



    }
}
