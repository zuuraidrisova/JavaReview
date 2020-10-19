package day46_Final_Abstract;

class Test{

    public final void method(){

        //instance method

        System.out.println("A");
    }

}


public class FinalMethods extends Test{

    public FinalMethods(){
        //u cannot apply final keyword to constructor
    }

    public final void method1(){

    }

    public final int method1(int a){
        //any method u can overload, even final method, by simply providing different prmtr
        return 100;
    }

    public final  static void method2(){

        // static method can be final
    }

   // public void method(){

        //overridden method is final, it cannot be final
        //if you want to override the method, dont mark it final
    //}


    public static void main(String[] args) {


    }

}
