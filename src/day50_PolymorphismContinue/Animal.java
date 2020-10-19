package day50_PolymorphismContinue;

public abstract class Animal {

     /*
    Warmup tasks:
    1. create a class Animal
            variables: age, gender
            methods: eat, sleep
        DO NOT make abstract we need this for today's example
    2. create subclass of Animal named Cat
            variable: catName
            methods: scratch
    3. create subclass of Animal named Dog
            variable: dogName
            methods: bark
     */

    public int age;
    public String gender;

    public void eat() {

        System.out.println("Animal is eating");
    }


    public void sleep() {

        System.out.println("Animal is sleeping");
    }

}

final class Cat extends Animal{

    public String catName;

    public Cat(String catName, int age, String gender){

        this.catName = catName;
        this.age = age;
        this.gender = gender;
    }

    public void scratch(){

        System.out.println(catName+" is scratching");
    }

    @Override
    public void eat(){

        System.out.println(catName+" is eating");
    }

    public void sleep(){

        System.out.println(catName+" is sleeping");
    }

    public String toString(){

        return "Cat Name: "+catName+" Age: "+age+" Gender: "+gender;
    }
}

final class Dog extends Animal{

    public String dogName;

    public Dog(String dogName, int age, String gender){

        this.dogName = dogName;
        this.age = age;
        this.gender = gender;
    }

    public void bark(){

        System.out.println(dogName+" is barking");
    }

    @Override
    public void eat(){

        System.out.println(dogName+" is eating");
    }

    public void sleep(){

        System.out.println(dogName+" is sleeping");
    }

    public String toString(){

        return "Cat Name: "+dogName+" Age: "+age+" Gender: "+gender;
    }
}


class AnimalObjects{


    public static void main(String[] args) {

    //Polymorphism occurs when parent super class is reference type to child sub class

        Dog animal1 = new Dog("Lucy",6,"female");

        System.out.println(animal1.dogName);

        animal1.bark();


        //Reference type decides what can be accessible

        Animal animal2 = new Dog("Layka",4,"female");
//    reference type      object type
        //compile error because we dont have dogName and bark() method in Animal class
        //animal2.dogName; ==>  we dont have dogName variable in reference class
        //animal2.bark();==> we dont have bark() method in reference class



        animal2.eat();
        animal2.sleep();

        boolean isDog = animal1 instanceof Dog;

        System.out.println(isDog);

        Dog d1 = new Dog("a",2,"male");

        //  boolean r1 = d1 instanceof Cat; there is no IS A relation

        boolean a = d1 instanceof Animal;//

        System.out.println(a);

    }

}
