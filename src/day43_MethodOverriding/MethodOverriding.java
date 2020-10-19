package day43_MethodOverriding;

class Test{

    public void method(){

        System.out.println("Onur");
    }
}

public class MethodOverriding  extends Test {
    /*
    Method Overriding:

            Same method name and same parameters, but different functions
            You cannot have 2 exactly same methods in one class, u cannot override in same class
            Method overriding must take place in sub class
            all method signatures must be same:
            access modifier, return type, methodName, parameter must be same

       public ==> protected ==> default ==> private

       access modifier in method overriding must be same or more visible

       ex:  if method is protected, we can make it public
       so if we have protected in super class ==> we can override it with public in sub!

   We need overriding:
        To come out with the correct functionality
        to implement different functions
        easy to remember
        less memory
        reusable, flexible
        Only ONE method is created in memory (The one created in Super class).

        Static methods and constructors and private cannot be overridden!!!

        because private cannot be inherited
        because Static has only one copy
        because constructor should have exactly same name with class, cannot be inherited

        ONLY INSTANCE METHOD CAN BE OVERRIDDEN, only inherited methods can be overridden

 @ ==> annotation : identifies if the method is overridden or not

     */

    @Override
    public void method(){

        System.out.println("Zarina"); //now we changed the function of the method
    }

    public static void main(String[] args) {

        Test obj = new Test();

        obj.method(); //Onur

        MethodOverriding obj1 = new MethodOverriding();

        obj1.method(); //Onur
    }

}

