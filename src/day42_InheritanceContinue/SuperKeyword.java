package day42_InheritanceContinue;

class A{

    int a = 100;

    public A(double b){

        System.out.println(this.a);
    }
}

public class SuperKeyword extends A {

    int a = 200;

    public SuperKeyword(){

        super(1.2);

        System.out.println("super.a = " + super.a);
        System.out.println("this.a = " + this.a);
    }

    public static void main(String[] args) {

        SuperKeyword sp = new SuperKeyword();

        System.out.println("=================================");

        A obj = new A(3.3);


    }



}
