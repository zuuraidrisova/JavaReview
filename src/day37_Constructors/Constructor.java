package day37_Constructors;

public class Constructor {
    /*
       Regular methods:
            AccessModifier  Specifier Return-type methodName(Parameter){
                        statements;
                        };

            AccessModifiers: ==> optional
                        public, private, default, protected
            Specifiers:==> optional
                       static, abstract, synchronized, final
            ReturnType: ==> must to create a method
                       void or any data type
            MethodName:==>must to create a method
                     any name
            Parameter : ==> can be without parameter
                     any data type

    Constructor > it is a special method:
                no specifier of whatsoever
                no returnType of any kind
                access modifier is optional

            AccessModifier methodName(parameter){
                    statements
                    };
    Constructor:
                Constructor is used to create objects,
                you have to provide constructor to create objects from class

                Constructor is mandatory for all classes
                But if you do not create constructor on your own,
                compiler creates one for you automatically by default

               ex:  Test obj = new Test();

                   methodName MUST be the same with class name

                Constructor should be declared outside main method

                execution always depends on object

                 Constructors are used to initialize object variables

        no-arg constructor or default constructor:
                public Constructor(){}
       constructor with arg:
                public Constructor(int a){}
     */

   // public Constructor(){ //default constructor

    //}

    public Constructor(int a){

        System.out.println("Constructor with int arg");
    }

    public static void main(String[] args) {

        Constructor constr = new Constructor(3);
        Constructor constr2 = new Constructor(3);




    }
}
