package day38_ConstructorChainRules;

public class ConstructorCalls {

      /*
    Constructor is special method to create objects of a class and to initialize objects

   1. Only constructor can call other constructors
   2. But you cannot call constructor by its name, it should be called thru this() keyword
   3. Constructor call should be called at first step, at the very beginning
   4. Constructor cannot call more than one constructor.
   5. Constructor cannot call itself or contain itself


        this. ==> calls instance variables
        this() ==> calls constructors

     */

    public ConstructorCalls(){

    }

    public ConstructorCalls(int a){

        this(); //this is calling default constructor
    }


}
