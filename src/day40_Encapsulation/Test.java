package day40_Encapsulation;

public class Test {

    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();
        //System.out.println(obj.SSN); cannot be accessed directly

        //read only
        System.out.println(obj.getSsn());//it is gonna return 0, because we have not assigned it yet

        //obj.SSN = 108321; cannot be set value directly

        obj.setSsn(12345);

        System.out.println(obj.getSsn());//now after we set, we have private value


    }
}
