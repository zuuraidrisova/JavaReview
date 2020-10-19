package day48_Interface;

public interface Interface_Intro {

    /*

    in abstract class:

        public abstract void method();

    in interface:

        void method(); ==> abstract by default
        no need to give abstract keyword
        public access modifier is given by default, it is always public

        PUBLIC is only access modifier we can have in interface
     */

    void method(); //abstract and public method by default

    public abstract void method2();

}

class Test implements Interface_Intro{

    //implements is keyword used to inherit form interface

    @Override
    public void method() {

        System.out.println("It is an overridden method from interface");
    }

    @Override
    public void method2() {

        System.out.println("It is an overridden method from interface");
    }
}


abstract class Test2 implements Interface_Intro{

    //when class which inherits from interface is abstract itself,
    // it does not have to override abstract methods


}