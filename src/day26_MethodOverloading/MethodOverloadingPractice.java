package day26_MethodOverloading;

public class MethodOverloadingPractice {

    //METHOD OVERLOADING  is readable, reusable and easy to remember, very flexible when we run

    public static void sum(int a, int b){

        System.out.println(a + b);
    }

    public static void sum(int a, int b, int c){

        System.out.println(a + b + c);
    }

    public static void sum(int a, int b, int c, int d){

        System.out.println(a + b + c + d);
    }
}
