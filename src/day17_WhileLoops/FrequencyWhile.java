package day17_WhileLoops;

public class FrequencyWhile {

    public static void main(String[] args) {

        String word = "JavaJavaJavaJava";

        int count = 0;

        while (word.contains("Java")){

            count++;

           word =  word.replaceFirst("Java","");
        }

        System.out.println("count = " + count);


    }
}
