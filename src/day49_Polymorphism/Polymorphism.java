package day49_Polymorphism;

public class Polymorphism {

    /*
    Polymorphism means "many forms", and it occurs when we have many classes
    that are related to each other by inheritance.

Inheritance lets us inherit attributes and methods from another class.
Polymorphism uses those methods to perform different tasks.
This allows us to perform a single action in different ways.

For example, think of a superclass called Animal that has a method called
animalSound(). Subclasses of Animals could be Pigs, Cats, Dogs, Birds -
And they also have their own implementation of an animal sound
(the pig oinks, and the cat meows, etc.):

Why And When To Use "Inheritance" and "Polymorphism"?
- It is useful for code re-usability: reuse attributes and methods of an existing
 class when you create a new class.

 Polymorphism:  objects behave in different multiple or many forms
            occurs in only one scenario:
       whenever we give super class, interface as a reference to child class objects

        occurs when parent class/interface reference to child class' objects

        Animal     dog2     =  new Dog();

        abstract class and interface are meant to be reference type,
         CAN NEVER BE IN OBJECT TYPE

      ex: class Dog extends Animal

            Dog  dog1  =  new Dog(); ==>object is created
       reference type can be Dog itself

          Animal dog2 = new Dog();
       reference to child class objects


whenever parent class is reference to child class
            it happens only when there is "is a " relationship
    ex:
    WebDriver driver = new ChromeDriver();

    ex:

     Dog dog1 = new Dog();
     Cat cat1 = new Cat();
     Bird bird1 = new Bird();

     Animal [] array = {dog1, cat1, bird1};
     //we can store all different types in one data structure

    abstract class and interface are meant to be reference type, not object type

    sub class can never be the reference type of super class object
     */
}
