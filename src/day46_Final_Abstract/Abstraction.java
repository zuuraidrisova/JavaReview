package day46_Final_Abstract;

public class Abstraction {

        /*

    Abstraction:  hiding the implementation (functions) details
                 concentrating on essentials, without worrying abt the details

        Data abstraction is the process of hiding certain details and
        showing only essential information to the user.

    The abstract keyword is a non-access modifier, used for classes and methods:

    Abstract class: is a restricted class that cannot be used to create objects
    (to access it, it must be inherited from another class).

 //abstract method can only be created in an abstract class and bu using interface

    abstract class is meant to be inherited

    abstract method ==> cannot be private, final, static

    Abstract method: can only be used in an abstract class,
     and it does not have a body.
    The body is provided by the subclass (inherited from).

ex1:
    Car : generic class, abstract (not real)

          start() : ==> create a method without a body,

    BMW: start() push to start

    Toyota: start() insert the key
ex2:
    Shape: ==> generic class
        area(); ==> marked abstract, without body

    Triangle:
        area(); ==> base * height * 1/2
    Circle:
        area(); ==> radius * radius *pi;
    Square:
        area(); ==> side * side


        abstract method: a method without the body(implementation)
                         an abstract method is a method which meant to be overridden

            public void method(){}; == >instance method

            public abstract void method(); ==>  abstract method without body


 Can we declare abstract method as static?
No, We can't use static keyword with abstract method.


    Can we declare abstract method as static?
    No, We can't use static keyword with abstract method.
    Can we declare abstract method as final?
    No, We cannot use final keyword with abstract class.
    Can we declare abstract method as private?
    No, We cannot declare abstract method as private.
    Can we use public, protected and default modifiers with abstract method?
    Yes, We can use public, protected and default modifiers with abstract method.

     */
}
