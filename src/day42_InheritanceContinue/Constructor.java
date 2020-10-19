package day42_InheritanceContinue;


class Test{

    public Test(){

        System.out.println("super class default constructor");
    }
}

public class Constructor extends Test{

    /*


            Constructor is not inherited,because same name should be used to create one

 constructor calls:

        1. at least one parent class  constructor must be called in sub class
        2.if parent class constructor is default , it is called by default
        3. if parent class constructor is not default, it is called bu super() keyword



     */

    public Constructor(){

        System.out.println("sub class default constructor");

    }

    public static void main(String[] args) {

        Constructor obj = new Constructor();
        //it runs first super class constructor then sub class constructor

        System.out.println("====================");

        Test obj2 = new Test();
        //it runs only super class constructor, because it is parent class
        //parent class cannot inherit anything


    }


}
