package day41_Inheritance;

public class Animal {

    public String name;
    public String size;
    public double weight;

    public void eat(){

        System.out.println(name+" is eating");
    }

    public void move(){

        System.out.println(name+" is sleeping");
    }
}

class Dog extends Animal{

    public void bark(){// only unique for dog class so we declare it inside dog class

        System.out.println(name+" is barking");
    }

    /*
  now  dog class inherited all features of animal class
    */

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Sasha";
        dog1.size = "small";
        dog1.weight = 12;


        System.out.println(dog1.name + " is "+dog1.size+" and "+dog1.weight+" pounds");

        dog1.move();
        dog1.eat();

        dog1.bark();


    }
}

class Fish extends Animal{

     /*
  now  fish class inherited all features of animal class
    */

    public void swim(){

        System.out.println(name+" is swimming");
    }

    public static void main(String[] args) {

        Fish fish = new Fish();

        fish.name = "Nemo";
        fish.size = "small";
        fish.weight = 2;


        System.out.println(fish.name +" is "+fish.size+" and "+fish.weight+" pounds");

        fish.eat();
        fish.move();
        fish.swim();

    }
}