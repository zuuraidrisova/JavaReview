package day23_CustomMethods;

public class CustomMethods {

    public static void main(String[] args) {

        /*
        Methods are used to perform certain actions, and they are also known as functions.
        A method is a block of code which is group to only run when it is called.
        Why use methods? To reuse code: define the code once, and use it many times.

     methods  should be declared inside a class but outside main method, because main is alsoa  method


        Declaration of methodS with no parameters:

            Access-Modifier == Specifier == ReturnType == methodName() {Statements}

            Access-Modifiers: decide visibility of methods
                    public, protected, default, private

           Specifier:
                    static, final, abstract, synchronized

           Return-type:
                    void , any other data type

           methodName:
                    variable name, which u use to call the method

        Information can be passed to methods as parameter to parenthesis

        You can have as many parameters as you like just separate with comma

           Declaration of methodS with  parameters:
            Access-Modifier == Specifier == ReturnType == methodName(param) {Statements}


        The void keyword indicates that the method should not return a value.
        If you want the method to return a value, you can use a primitive data type
         (such as int, char, etc.) instead of void, and use the return keyword
         inside the method.

         */


        printHello5Times();
        printEvenNumbers();
        printOddNumbers();
        eligibleToBuyAlcohol(12);

    }

    public static void printHello5Times(){

        for(int i = 0; i < 5; i++){

            System.out.println("Hello World!");
        }
    }


    public static void printOddNumbers(){

        for (int i = 0; i < 100; i++){

            if(i % 2 != 0){

                System.out.print(i+" ");
            }
        }

        System.out.println();
    }

    public static void printEvenNumbers(){

        for (int i = 0; i < 100; i++){

            if(i % 2 == 0){

                System.out.print(i+" ");
            }
        }

        System.out.println();
    }


    public static void eligibleToBuyAlcohol(int age){

        if(age >= 21){

            System.out.println("You can buy alcohol!");
        }else{

            System.out.println("You are not old enough!");
        }

    }




}
