package day54_Maps;

public class StringBuilderStringBuffer {

    public static void main(String[] args) {

        /*
        String: ==> immutable, cannot be modified

        String Builder: mutable version of char sequences

        String Buffer:  mutable version of char sequences

        there was only string Buffer before, it is a legacy one, and all methods in
        String  Buffer were synchronized, so thread-safe, consequently  it was slow

        Then String Builder was created later, because String Buffer was too slow,
        String Builder methods are not synchronized

        StringBuilder and StringBuffer have very useful methods like reverse()

         */

            //string literal -> String Pool
        String str1 = "Cybertek";

        str1.concat("School");//we did not re assign it , so not modified

        System.out.println("str1 = " + str1);//"Cybertek" cant be changed , immutable

        // new -> heap memory
        String str2 = new String("MIT");

        str2 = str2.concat(" School"); //we re-assigned it, now it will refer to latest one

        System.out.println(str2);

        System.out.println("=================================");

        StringBuilder builder = new StringBuilder("Cybertek");

        builder.append(" School");//synchronized
        //we can append now, bcs it is mutable version of String

        System.out.println("builder = " + builder);//Cybertek School

        System.out.println("=================================");

        StringBuffer buffer = new StringBuffer("Cybertek");

        buffer.append(" School");//not synchronized
        //we can modify now, bcs it is mutable version of String

        System.out.println("buffer = " + buffer);//Cybertek School

       // String Buffer is a legacy version, it is synchronized
        // String Builder is a new version, it is not synchronized

        System.out.println("=================================");

        String word = "ABCD";

        StringBuilder builder2 = new StringBuilder(word);

        builder2.reverse();//reverses the string and return a new value

        System.out.println("builder2 = " + builder2);

        word = builder2.toString(); //we can re-assign it using toString() method

        System.out.println("word = " + word);

        System.out.println("=================================");

        String word2 = "ABCD";

        String reversed = "";
        // we have to use for loop in order to reverse a string

        for(int i = word2.length()-1; i >= 0; i --){

            reversed += word2.charAt(i);
        }

        System.out.println("reversed = " + reversed);

        System.out.println("=================================");


        StringBuffer buffer1 = new StringBuffer(word2);

        buffer1.reverse();

        System.out.println("buffer1 = " + buffer1);
    }
}
