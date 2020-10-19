package day20_ArrayUtilities;

public class Frequency {

    public static void main(String[] args) {

        String str = "I like Java, Java is fun, Java is a very powerful programming language";

        int count = 0;

        while(str.contains("Java")){

            count++;

            str = str.replaceFirst("Java","");
        }

        System.out.println("count = " + count);

    }
}
