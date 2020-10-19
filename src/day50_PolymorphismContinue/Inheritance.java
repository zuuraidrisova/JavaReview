package day50_PolymorphismContinue;

public class Inheritance {

    public int publicVariable = 100;
    protected int protectedVariable = 300;
    int defaultVariable = 200;
    private int privateVariable = 400;


}

class Data extends Inheritance{

    public static void main(String[] args) {

        Data data = new Data();

        System.out.println(data.publicVariable);//can be inherited everywhere in subclasses
        System.out.println(data.protectedVariable);//can be inherited in sub classes
        System.out.println(data.defaultVariable);//can be inherited in  subclasses within the same package

        // System.out.println(obj.privateVariable); ==> cannot be inherited
    }
}