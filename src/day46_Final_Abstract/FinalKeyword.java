package day46_Final_Abstract;

public class FinalKeyword {

    /*
   FINAL ==? NON-ACCESS-MODIFIER:

   final is constant, cannot be changed

        final variables: cannot be reassigned
        final methods: function cannot be changed, cannot be overridden
        final class: cannot be inherited

    final =	Attributes and methods cannot be overridden/modified
    final =	The class cannot be inherited by other classes

    If you don't want the ability to override existing attribute values,
    declare attributes as final:

    static block and instance initializer blocks cannot be final
    */

    final int instanceVariable = 300;
    //final instance variables need to be initialized right away
    //instance variables ==>  each have their own copies


    final static int staticVariables = 1000;
    //final static variables need to initialized immediately
    //static variables ==> all objects share same one copy

    public static void main(String[] args) {

        final int score ; // we do not have to initialize final local variables immediately

        score = 100;//but we have to initialize it before use

        System.out.println("score = " + score);


        final double pi = 3.14;
        //pi = 3.15;==> compile error because we cannot reassign final variables

        System.out.println("pi = " + pi);

        final char gender = 'F';
        //  gender = 'F' ;==> compile error because we cannot reassign final variables

        System.out.println("gender = " + gender);

        FinalKeyword obj = new FinalKeyword();

        System.out.println("obj.instanceVariable = " + obj.instanceVariable);
        //instance variable execution depends on creation of an object

        System.out.println("FinalKeyword.staticVariables = " + FinalKeyword.staticVariables);
        //static variables can be called thru the class name

    }

}
