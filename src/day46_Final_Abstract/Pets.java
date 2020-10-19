package day46_Final_Abstract;

public abstract class Pets {

    /*
     abstraction practice tasks:
	Task01:
		1. create an abstract class called Pets
				attributes: name, age, color, breed, gender
				methods:
					abstract methods: sleep, eat, speak
					instance method: toString
		2. create three sub classes (non-abstract) of pet:
								1. Dog
								2. Cat
								3. Tiger
				each class MUST have constructors to initialize the attributes
     */

    public String name;
    public  int age;
    public String color;
    public String breed;
    public char gender;


    public abstract  void sleep(int hours);

    public abstract void eat(String food);

    public abstract void speak(String language);

    public String toString(){

        return name+" "+breed+" "+color+" "+age+" "+gender;
    }


}


class Dog extends Pets{


    public Dog(String name, int age, String color, String breed, char gender){

        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;

    }

    @Override
    public void sleep(int hours){

        System.out.println(name +  " sleeps "+hours+" hours");
    }

    @Override
    public void eat(String food){

        System.out.println(name + " eats "+food);
    }

    @Override
    public void speak(String language ){

        System.out.println(name +" can speak "+language);
    }
}

class Cat extends Pets{

    public Cat(String name, int age, String color, String breed, char gender){

        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;

    }

    @Override
    public void sleep(int hours){

        System.out.println(name +  " sleeps "+hours+" hours");
    }

    @Override
    public void eat(String food){

        System.out.println(name + " eats "+food);
    }

    @Override
    public void speak(String language ){

        System.out.println(name +" can speak "+language);
    }

}

class Tiger extends Pets{

    public Tiger(String name, int age, String color, String breed, char gender){

        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;

    }

    @Override
    public void sleep(int hours){

        System.out.println(name +  " sleeps "+hours+" hours");
    }

    @Override
    public void eat(String food){

        System.out.println(name + " eats "+food);
    }

    @Override
    public void speak(String language ){

        System.out.println(name +" can speak "+language);
    }
}