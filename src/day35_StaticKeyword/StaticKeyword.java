package day35_StaticKeyword;

public class StaticKeyword {
    /*
    Static means it is a class memeber, belongs to class

    static:
         variables,
         methods,
         initializer blocks,
         class


    Local variables are declared within a block, cannot be accessed outside

    Instance variable means that every single object has its own copy, declared outside blocks

    Static variable means all objects have only one same copy, declared outside blocks

    Static methods can be called thru the class name without creating an object of the class


     */

    int a2 = 100; //instance variable, can be used outside if object of class is created

    static int a3 = 300;//static, belongs to class, only one copy for all objects


    public static void main(String[] args) {

        int a1 = 100;//local variable, cannot ube used outside this block

        StaticKeyword obj1 = new StaticKeyword();

        obj1.a2 = 1000;
        obj1.a3 = 5000;

        StaticKeyword obj2 = new StaticKeyword();

        obj2.a2 = 2000;

        //obj1 and obj2 have two different copies, because they are instance variables

        System.out.println("obj1 = " + obj1.a2);//different data
        System.out.println("obj2 = " + obj2.a2);//different data

        System.out.println("obj1.a3 = " + obj1.a3);//same copy
        System.out.println("obj2.a3 = " + obj2.a3);//same copy




    }

}
