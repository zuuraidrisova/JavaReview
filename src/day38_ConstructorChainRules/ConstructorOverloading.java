package day38_ConstructorChainRules;

public class ConstructorOverloading {
    /*

    Regular method Overloading: same name but different parameters
                or different data type as parameters

    Constructor Overloading:
         we can have multiple constructors in a class bu using method overloading


     */
}

class Dog{

    String breed;
    String name;
    int age;

    public Dog(){

        breed = "unknown";
        name = "unknown";
        age = 0;
    }

    public Dog(String breed){

        this.breed = breed;
        name = "unknown";
        age = 0;

    }

    public Dog(String breed, int age){

        this.breed = breed;
        name = "unknown";
        this.age = age;

    }


    public String toString(){

        return "Breed: "+breed+" Name: "+name+" Age: "+age;
    }
}

class DogObject{

    public static void main(String[] args) {

        Dog dog1 = new Dog();//default constructor

        System.out.println(dog1.name);
        System.out.println(dog1.breed);
        System.out.println(dog1.age);

        System.out.println(dog1);

        System.out.println("====================================");

        Dog dog2 = new Dog("Husky");//constructor with one String arg

        System.out.println(dog2.name);
        System.out.println(dog2.breed);
        System.out.println(dog2.age);

        System.out.println(dog2);

        System.out.println("====================================");

        Dog dog3 = new Dog("Poodle", 4);//constructor with one String arg and one int arg

        System.out.println(dog3.name);
        System.out.println(dog3.breed);
        System.out.println(dog3.age);

        System.out.println(dog3);

        System.out.println("====================================");

    }
}