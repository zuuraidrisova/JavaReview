package day43_MethodOverriding;

public class MethodOverloading {

     /*
    Method Overloading:

        Same method name but different parameters,
        Return type can be same or different, no matter
        Access modifier can be same or different
        any method can be overloaded(main method, constructor, instance method, static method)

     */

    public void add(int a, int b){

        System.out.println(a + b);
    }

    public void add(int a, int b, int c){

        System.out.println(a + b + c);
    }

    public void add(double a, double b, double c){

        System.out.println(a + b + c);
    }

}
