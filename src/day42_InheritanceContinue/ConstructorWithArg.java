package day42_InheritanceContinue;


class Test2{

    public Test2(int a){//constructor of super class with prmtr

        System.out.println("super class constructor with int args");
    }
    public Test2(double b){

        this(1);//this() keyword constructor can be called within the same class
        System.out.println("super class constructor with double arg");

    }
}
public class ConstructorWithArg extends Test2{

    /*


    only constructor can call other constructors

    Current class constructor call:

    this: keyword refers to object instances of current class
           calls instance variables and instance methods of current class
    this() : keyword is used for calling  constructors from current class

    Super class constructor call:

    super: keyword refers to object instances of super class
            calls instance variables and instance methods of super class
    super() :  keyword is used for calling constructors of super class


 */

    public ConstructorWithArg(){

        //sub class constructor must call super class constructor,
        // if super class constructor is default, it is called by default

        super(0.8);// sub class constructor is calling super class constructor with double arg
        System.out.println("sub class  default constructor");
    }

    public static void main(String[] args) {

        Test2 obj = new Test2(1);
        //super class constructor with args will be printed
        //because parent cannot inherit

        System.out.println("===========================");

        ConstructorWithArg obj2 = new ConstructorWithArg();
        // super class constructor will be printed first, and then sub class default constructor


    }
}
