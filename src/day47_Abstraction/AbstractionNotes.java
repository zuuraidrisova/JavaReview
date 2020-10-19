package day47_Abstraction;

public class AbstractionNotes {

     /*
 things can be abstract:

    Abstract method,
    Abstract class,
    Interface

    Abstraction means hiding the implementation detail,
    1. which is i know just the name, but i dont know what it does,
           because it doesnt have body
    3. in order not to give body to method we create, we use abstract keyword
    4. class must be abstract so its methods can be abstract


      abstract method is meant to be overridden,
      in order to override it, we must inherit
      we override in order to give different implementation

    abstract methods cannot be private, static, final:

   1: private method cannot be overridden, because it is not inherited,
   since abstract method is meant to be overridden, so private method cant be abstract

   2: static method cannot be abstract, because there is only one copy, cannot be overridden

   3: final method cannot be changed, it is constant,so it cannot be abstract

      There are 2 way to achieve abstraction:
            1.abstract class
                abstract class is meant to be inherited
                from abstract class we cannot create objects
                final class cannot be abstract
            2.interface


   ex:
        public void method(){};  ==> regular method has body, it must have it

        public abstract method(); ==>has keyword abstract and no body {}


        RemoteWebDriver: ==>super class of all browsers

               abstract get(Url); abstract method
               abstract close(); abstract method

            now these sub classes overriding existing abstract method
        Chrome extends RemoteWebDriver :
            get(URL);==> open chrome browser in given url

            close();==>  close chrome tab

        Firefox extends RemoteWebDriver :
            get(URL);==> open firefox browser in given url

            close();==>  close firefox tab

        Opera extends RemoteWebDriver :
            get(URL);==> open opera browser in given url

            close();==>  close opera tab

        Cybertek extends  RemoteWebDriver:

            get(URL);==> open cybertek browser in given url

            close();==>  close cybertek tab

why we cannot create objects from abstract class?
        abstract is not concrete, object has to be concrete

        when abstract class is extended by regular class:
            it is mandatory to override all abstract methods of super class
        when abstract class is extended by another abstract class:
            we dont have to override, but if we want we can override

    if we dont want our subclass to be a parent to another class, we can mark it
    final, after final it can never be inherited

    abstract class vs non-abstract class:

    non-abstract:

      non-abstract or regular class you can have everything, except abstract methods
      u can have: instance variables, instance methods,instance block, static members
      non-abstract class can be final

    abstract class:

        we can have everything and plus abstract method, the only disadvantage is
        we cannot create an object
        abstract class is meant to be inherited, so it cannot be final

shortcut to override abstract methods of super class:

    1: click the end of class signature
    2: hold option button
    3: hit Enter
    4: hit Enter 2 times

    or

    1: right click the mouse and go to generate
    2: select implement methods
    3: hit OK
     */
}
