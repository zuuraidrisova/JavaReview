package day50_PolymorphismContinue;

public class ReferenceTypeCasting {

    public static void main(String[] args) {


        int a = 100;

        double d = a;//implicit casting, automatically, smaller type to larger


        Dog dog = new Dog("Kelly",3,"male");

        Animal animal1 = (Animal) dog;//upCasting, done implicitly,
        //when we can assign sub class object to super class

        Cat cat = new Cat("Cola",2,"female");

        //   Dog dog1 = (Dog)cat;//there is not inheritance relationship

        Animal animal2 = (Animal) cat;// upCasting, we can give reference type

        System.out.println("=================================================");

        int i = 200;
        short s = (short)i;//explicit casting, done manually

        Animal animal3 = new Dog("Ave", 13,"female");

        Dog dog1 = (Dog)animal3;//downCasting ==> super class type is changed
        //          to sub class type


        Animal animal4 = new Cat("Cee",2,"female");

        Cat cat1 = (Cat)animal4;

        System.out.println("=========================================");

        Animal animal5 = new Dog("Lucy",3,"female");

        //animal5.bark();

        Dog dog2 = (Dog) animal5;

        dog2.bark();//after we cast , we can call bark method

        //second way, by grouping in paranthesis

        ((Dog) animal5).bark();


    }
}
