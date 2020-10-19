package day38_ConstructorChainRules;

public class ConstructorCalls2 {

    public ConstructorCalls2(){

        System.out.println("default constructor");
    }

    public ConstructorCalls2(int a){

        //this is calling default constructor
        this();// only one constructor call inside another constructor
        System.out.println("constructor with int arg");
    }

    public ConstructorCalls2(String str){

        //this is calling constructor with int arg
        this(10);// call is done always at first step");
        System.out.println("constructor with String arg");
    }


    public static void main(String[] args) {

        ConstructorCalls2 calls2 = new ConstructorCalls2("str");

        System.out.println(calls2);

        //chain relation == > constructor with string argument is
        // calling constructor with int argument and constructor with int argument
        // is calling default argument
    }
}
