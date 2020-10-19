package day46_Final_Abstract;

public class FinalPractice {

    final int a = 100;

    final  static  int b = 200;

    //instance initializer block and static block cannot be final,
    // bcs it is against their nature

    {
     //   a = 200; cannot be reassigned
    }

    static {

       // b = 90; cannot be reassigned
    }


    public final void method1(){

        // instance method can be final, it just means  u cannot change its functionality
    }

    public final static void method2(){

        //static method can be final
    }


}


