package day29_WrapperClass_ArrayList;

public class ParseMethods {

    public static void main(String[] args) {

        // parse methods: converts string of text into numbers, return primitive types not objects

        String str = "123";

        int num = Integer.parseInt(str); //converting string to integer now

        System.out.println("num = " + num);//number
        System.out.println("str = " + str); //string of text

        byte b1 = Byte.parseByte(str); //byte primitive out of string

        System.out.println("b1 = " + b1);

       // Integer i1 = Byte.parseByte(str); Integer is loyal to int only, does not accept others

        String str2 = "10.5";

       float f =  Float.parseFloat(str2);

        System.out.println("f = " + f);

        String str3 = "12362541370";

       long l =  Long.parseLong(str3);

        System.out.println("l = " + l);

        String str4 = "true";

       boolean bool =  Boolean.parseBoolean(str4);//not case sensitive

        System.out.println("bool = " + bool);


        //valueOf methods: converts string of text into wrapper class







    }
}
