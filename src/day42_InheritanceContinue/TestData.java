package day42_InheritanceContinue;

public class TestData extends Data {
        //    sub             super
    public static void main(String[] args) {

        // public, protected, default  can be inherited,

        //because all variable are static they can be called thru class name or by themselves
        System.out.println("publicData = " + publicData);
        System.out.println("protectedData = " + protectedData);
        System.out.println("defaultData = " + defaultData);

        //System.out.println(privateData);
        //private data can never inherited  in anywhere

        System.out.println("===============================");

        // can be called directly too

        publicMethod();
        protectedMethod();
        defaultMethod();

        // privateMethod(); private  can never be inherited

        System.out.println("===============================");

        // all  methods can be called thru class name because they are static

        TestData.publicMethod();
        TestData.protectedMethod();
        TestData.defaultMethod();


    }
}
