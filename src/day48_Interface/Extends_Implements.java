package day48_Interface;

interface I1{

    //ONLY ONE ABSTRACT METHOD IN THIS CLASS
    void method1();
}
interface I2 extends I1{

    //TWO ABSTRACT METHOD IN THIS CLASS
    void method2();
}

abstract class AC implements I2{

    //THREE ABSTRACT METHOD IN THIS CLASS
    abstract void method3();

}

public abstract class Extends_Implements extends AC{
      /*
  extends:

    abstract class extends class
            class  extends abstract class
        interface  extends interface
             class extends class

  implements:

        class implements interface

        interface implements class==> no such a thing

        /* we have 3 abstract methods now, since it is an abstract class
                it is optional to override abstract methods
            we already override one of the abstract methods

         */

    @Override
    public void method1() {

    }
}

class test extends Extends_Implements{

    //we have to override 2 abstract methods now
    //the first abstract method has already been overridden in super class

    @Override
    public void method2() {

    }

    @Override
    void method3() {

    }
}