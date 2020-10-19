package day48_Interface;

public class InterfaceNotes {
    /*

    Abstraction is hiding the implementation details , with abstract keyword and no body

    class can be abstract
    methods can be abstract

    There are 2 ways to achieve abstraction:

        1. Abstract class
        2. Interface

    Interface:
      blue print of the class, used for specifying the behaviors
            that class should implement
      used to achieve abstraction
      meant to be inherited, so no final for interface

      creating a class:

        public class className{}

      creating interface:

        public interface interfaceName{}

    in abstract class:

        public abstract void method();
        we have to specify access modifier and use abstract keyword

    in interface:

        can be supertype

        when class inherits class we use extends keyword
        when class inherits interface we use implements keyword
        when interface inherits interface we use extends keyword

        void method(); ==> abstract by default
        no need to give abstract keyword
        public access modifier is given by default, it is always public

        Why we need interface??

           class can only  extend one abstract class ,

           when class inherits interface it can implement many interfaces

 subclass only extend one superclass but can implement more than one interface

        what we can have in Interface??

        variables in Interface:
                can only be static and final at the same time,
                and only public access modifier

        methods in Interface:
                abstract methods, static methods, default methods

                Default methods ==> special methods to enable lambda expressions
                            can only be created in interface and can be inherited


    What we cannot have in Interface??

      Interface does not have constructor, so we cannot create object from it
      if no object can be created, so it cannot have instance variables and methods
      we dont have instance variables in interface, so we cannot have instance blocks
      static block, because variables in Interface are always final


Notes on Interfaces:
Like abstract classes, interfaces cannot be used to create objects
Interface methods do not have a body - the body is provided by the "implement" class
On implementation of an interface, you must override all of its methods
Interface methods are by default abstract and public
Interface attributes are by default public, static and final
An interface cannot contain a constructor (as it cannot be used to create objects)

Why And When To Use Interfaces?

1) To achieve security - hide certain details and only show the important details
of an object (interface).

2) Java does not support "multiple inheritance" (a class can only inherit
from one superclass). However, it can be achieved with interfaces,
because the class can implement multiple interfaces.
Note: To implement multiple interfaces, separate them with a comma

        extends and implements keywords can be used at the same time, but
        extends must come before implements

            abstract class VS interface:
* Both abstract class and interface are meant to be inherited
* both abstract class and interface can NOT be final
* both abstract class and interface can NOT create object
* both  abstract class and interface are used to achieve abstraction


     */
}
