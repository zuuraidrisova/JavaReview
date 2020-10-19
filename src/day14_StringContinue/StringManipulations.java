package day14_StringContinue;

public class StringManipulations {

    public static void main(String[] args) {

        String str = "I like to learn Java and watch I like to watch Jumanji";

        //indexOf(value) => returns an index number of first given value as an int

        int index = str.indexOf("J");

        System.out.println("index = " + index);

        int index2 = str.indexOf("Jum");

        System.out.println("index2 = " + index2);

        int index3 = str.indexOf(" I") + 1;

        System.out.println("index3 = " + index3);

        //lastIndexOf(value) => returns an index number of last given value as an int

        int index4 = str.lastIndexOf("I");

        System.out.println("index4 = " + index4);

        int index5 = str.lastIndexOf("J");

        System.out.println("index5 = " + index5);

        String java = "I like Java, Java is fun, Java is powerful";

        int index6 = java.indexOf("Java is");

        System.out.println("index6 = " + index6);

    }
}
