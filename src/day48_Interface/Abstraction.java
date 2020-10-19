package day48_Interface;

interface A{

    void method1(); //public and abstract  by default

}

interface B{

    abstract void method2();//public by default

}

interface C{

    public abstract void method3();

}

public class Abstraction implements A, B,C{

    //subclass can implement more than one interface
    //when class implements multiple interfaces, we have to separate them by comma

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }
}
