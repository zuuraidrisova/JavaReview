package day42_InheritanceContinue;

public class Data {

    public static String publicData = "public";
    protected static String protectedData = "protected";
    static String defaultData = "default";
    private static String privateData = "private";


    public static void publicMethod(){

        System.out.println("public method");
    }

    protected static void protectedMethod(){

        System.out.println("protected method");
    }

    static void defaultMethod(){

        System.out.println("default method");
    }

    private static void privateMethod(){

        System.out.println("private method");
    }

}
