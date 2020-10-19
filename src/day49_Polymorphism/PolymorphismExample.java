package day49_Polymorphism;

interface Animal{
    //super class can be reference type to child class

}

class Dog implements Animal{

}

class Cat implements Animal{

}

public class PolymorphismExample {

    public static void main(String[] args) {


       // Animal obj = new Animal(); we cannot create obj from interface

        //this is where polymorphism occurs
        Animal dog1 = new Dog();
        Animal cat1 = new Cat();

        Dog dog2 = new Dog();
        Cat cat2 = new Cat();

        Animal [] animals = {dog1,dog2,cat1,cat2};




    }

}
