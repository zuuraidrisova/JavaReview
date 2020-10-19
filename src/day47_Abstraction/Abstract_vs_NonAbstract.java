package day47_Abstraction;


class Test1{

    public Test1(){

    }

    public void method1(){

    }

    public static void method2(){

    }

    int a = 100;
    static int b = 200;


   // public abstract void method3(); in regular class we cannot have abstract methods

}


abstract class Test2{

    public Test2(){

    }

    public void method1(){

    }

    public static void method2(){


    }

    int a = 200;
    static int b = 90;


    public abstract void method3();

    //abstract class can have everything and plus abstract methods
    //we cannot create an object ==> disadvantage
    //abstract class cannot be final


}

public class Abstract_vs_NonAbstract {


}
