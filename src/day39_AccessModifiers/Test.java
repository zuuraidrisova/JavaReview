package day39_AccessModifiers;

public class Test {

    public static void main(String[] args) {

        AccessModifiers am = new AccessModifiers();

        System.out.println("am.num = " + am.num);//can be used within this package but different classes
        System.out.println("am.num2 = " + am.num2);//open to the world

       // System.out.println(am.num3);// visible only within class its  declared


    }
}
