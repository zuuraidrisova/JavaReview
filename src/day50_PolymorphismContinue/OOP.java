package day50_PolymorphismContinue;

public class OOP {

    /*

    OOP ==> Object Oriented Programming
    Encapsulation, Inheritance, Abstraction, Polymorphism

    Encapsulation:
            hiding data using private access modifier

            use public setter/getter to access them outside class

            getter:  read-only, accessor, returns the private data
            //if variable is final, we can generate only getter

            setter: write-only, mutator, changes or sets the private data

    Inheritance:
            building IS A relationship, parent-child, super-sub relationship
            easy way to get rich

        super class: cannot inherit anything from child
                    is class being inherited

                   relationship is built by using extends keyword

        sub class: can inherit visible variables and visible  methods from
                     super  class, except constructor


     ex:    class A extends B{} ==> A is sub class, B is super class


        Method overriding: Must happen in sub class

    advantage of Inheritance: less code, reusable, easy to maintain


    Abstraction:
            hiding the implementation details

            2 ways to achieve abstraction:
                    abstract class and interface

         abstract method(); ==> does not have body, meant to be overridden

         abstract method ==> cannot be final, static, private

         abstract method can be overloaded

         abstract class cannot be final, and cannot create and object

    Interface: blueprint of class specifies the behavior a class should implement
               we can implement multiple interfaces
               only public access modifier is used by default

   Interface can have:  variables are static and final and public at the same time
               methods:  can be abstract, static,default methods
   Interface cannot have: constructors, instance variables, instance blocks,
                            static blocks, instance methods

    Interface cannot be used to create objects

      implements keyword is used when class inherits from interface

      extends vs implements:
        same type ==> extends

        class  extends  class
        interface extends interface

        class implements interface

    when both used at the same time, extends comes first, and then implements


    Polymorphism:
            objects behave in meany forms

             occurs when parent class/interface is reference to child's class object

            reference type decides what can be accessible, what can be called

     */
}
