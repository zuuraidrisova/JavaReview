package day33_CustomClass;

public class Cat {

    String name;
    String breed;
    String color;
    int age;

    public void setCatInfo(String name, String breed, String color, int age){

        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;

    }

    public void eat(String food){

        System.out.println(name+ " is eating "+food);
    }

    public void sleep(int hours){

        System.out.println(name+" sleeps "+hours+" hours");
    }

    public void drink(String drink){

        System.out.println(name+" is drinking "+drink);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age;
    }
}
