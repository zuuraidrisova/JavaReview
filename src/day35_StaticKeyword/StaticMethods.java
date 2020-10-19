package day35_StaticKeyword;

public class StaticMethods {

    int a = 100;
    static int b = 200;

    public void method(){

        System.out.println(a);
        //instance method can call instance variables
        System.out.println(b);
        //static can also be called in instance method, because static means global
    }

    public static void main(String[] args) {

       // System.out.println(a); does not compile because a is instance variable
        //static accepts only static

        StaticMethods obj = new StaticMethods();

        System.out.println("obj.a = " + obj.a);
        //instance variable can be called only thru the creation of an object

        System.out.println("obj.b = " + obj.b);//static can be called thru object
        System.out.println(StaticMethods.b);//it can be called thru the class name

        obj.method();

    }
}
