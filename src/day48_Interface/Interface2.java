package day48_Interface;

public interface Interface2 {

   public static final int b = 200;
    //variables we give in interface are final and static by default, also public
    //final means cannot be re-initialized
    //static means only one copy
    //public means accessible to all classes

    int a = 30;//even if u dont specify, variables are all public, static and final by default

    public static void method(){

        System.out.println("static method in interface");
    }

    void method2(); //public abstract method by default

    public static void main(String[] args) {

        System.out.println("b = " + b);
        System.out.println("a = " + a);

        method();
    }

}
