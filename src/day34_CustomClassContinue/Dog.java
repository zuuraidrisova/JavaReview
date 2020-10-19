package day34_CustomClassContinue;

public class Dog {

    String name;
    String breed;
    String size;
    int age;
    String color;

    //this keyword is used to refer to the current object of the class
    // this keyword is used to call object instances

    public void setDogInfo(String name, String breed, String size, int age, String color){

        this.name = name;
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    ///without toString it will print hashcode
    public String toString(){

        return "Dog name: "+name+", Dog breed: "+breed+
                ", Dog size: "+size+", Dog age: "+age+", Dog color: "+color;
    }


    public void eating(String food){

        System.out.println(name + " is eating "+food);
    }

    public void drinking(String drink){

        System.out.println(name+" drinking "+drink );
    }

    public void playing(){

        System.out.println(name+" is playing");
    }
}
