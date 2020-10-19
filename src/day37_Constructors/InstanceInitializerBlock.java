package day37_Constructors;

public class InstanceInitializerBlock {

    /*
    Two blocks: they can be placed anywhere

    Static initializer block: executed as soon as class is loaded, runs only once
                                accepts only static members

                                static{
                                      statement;
                                   }

    Instance initializer block: designed to initialize instance variables
                                 belongs object, runs only if object is created
                                 execution of instance block depends on how many objects
                                            are created
                                {
                                 statement;
                                  }
     */
    static {
        System.out.println("Static block"); //runs first and only once
    }

    {
        System.out.println("Instance block"); //will get executed twice bcs we have 2 objects
    }

    public static void main(String[] args) {

        InstanceInitializerBlock ins = new InstanceInitializerBlock();

        InstanceInitializerBlock ins2 = new InstanceInitializerBlock();
    }

}
