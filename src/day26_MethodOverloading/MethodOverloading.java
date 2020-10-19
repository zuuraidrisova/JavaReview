package day26_MethodOverloading;

public class MethodOverloading {

    public static void main(String[] args) {

        /*
        With method overloading, multiple methods can have
        the same name with different parameters:

            static int plusMethodInt(int x, int y) {
                     return x + y;
                    }

            static double plusMethodDouble(double x, double y) {
                      return x + y;
                }
        Instead of defining two methods that should do the same thing, it is better
         to overload one.
         */

    }

    public static void method(){

        System.out.println("Original method");
    }

    public static void  method(int a){

        System.out.println("Overloaded method by providing a parameter");
    }

    public static void  method(double a){

        System.out.println("Overloaded method by changing a parameter");
    }

    public static void  method(int a, int b){

        System.out.println("Overloaded method by providing two parameters");
    }
}
