package day22_LoopsArrays;

import java.util.Arrays;

public class JavaPython {

    public static void main(String[] args) {

        /*
        write a program that can return the number of appearances of "java" and "python"
         anywhere in the sentence
                (it's similar to the task 97 in repl.it, But this time you MUST
                use arrays and for each loop)
         */

        String str = "Java is fun, I like Java and Javascript, Python is easy";

        int countJava = 0;
        int countPython = 0;

        while(str.contains("Java ")){

            countJava++; //here it counts JavaScript as well, so we add just white space to differentiate

            str = str.replaceFirst("Java", "");

        }

        while(str.contains("Python")){

            countPython++;

            str = str.replaceFirst("Python", "");

        }


        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);

        System.out.println("======================");

        //count java and python use array and for loop
        String str1 = "Java is fun, I like Java and Javascript, Python is easy";

        String [] sentence =   str1.split(" ");

        System.out.println(Arrays.toString(sentence));

       int java = 0 ;
       int python = 0;

       for (int i = 0; i < sentence.length; i++){

           if(sentence[i].equalsIgnoreCase("java")){

               java++;

           }else if(sentence[i].equalsIgnoreCase("python")){

               python++;
           }
       }

        System.out.println("java = " + java);

        System.out.println("python = " + python);


        System.out.println("======================");

        //count java and python use array and for  each loop

        String str3 = "Java is fun, I like Java and Javascript, Python is easy";

        String words [] = str3.split(" ");

        int javaCount = 0;
        int pythonCount = 0;

        for( String each : words){

            if(each.equals("Java")){

                javaCount++;

            }else if(each.equalsIgnoreCase("python")){

                pythonCount++;

            }
        }

        System.out.println("javaCount = " + javaCount);
        System.out.println("pythonCount = " + pythonCount);


    }
}
