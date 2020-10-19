package day34_CustomClassContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObject {

    public static void main(String[] args) {

        //you can create as many objects as you want from class
        //all objects have thier own copy of instance variables
        Dog dog1 = new Dog();

        dog1.setDogInfo("Sasha", "Husky", "small", 3,"grey");

        Dog dog2 = new Dog();

        dog2.setDogInfo("Ajdar", "Alabay","extra big", 5, "brown");

        Dog dog3 = new Dog();

        dog3.setDogInfo("Lucy", "Poodle", "Miniature", 2,"white");

        Dog dog4 = new Dog();

        dog4.setDogInfo("Eric", "Pomeranian", "big", 4,"white");

        Dog dog5 = new Dog();

        dog5.setDogInfo("Lil", "Poodle", "medium", 7,"black");


        ArrayList<Dog> dogs = new ArrayList<>(Arrays.asList(dog1,dog2,dog3,dog4,dog5));

        for (Dog each : dogs){

            System.out.println(each);
        }

        System.out.println("=============================================");

        dogs.removeIf(p -> p.age > 2);

        for (Dog each: dogs){

            System.out.println(each);
        }

        System.out.println("=============================================");

        dog2.eating("chicken");

        dog4.eating("fish");

        dog1.drinking("water");

        dog3.drinking("milk");

        dog5.playing();


    }
}
