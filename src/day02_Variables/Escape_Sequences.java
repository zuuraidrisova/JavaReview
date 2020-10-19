package day02_Variables;

public class Escape_Sequences {

    public static void main(String[] args) {

        /*

        Escape sequences must be given within the double quotes

        \t :  paragraph space
        \n :  new line
        \" :  prints double quotes in console
        \\ : in order to print a single slash we need to give \\ double slash
         ' : single quote can be printed




         */
        System.out.println("\tHello");
        System.out.println("\t\t\t\t\t\t\t\tHello");
        System.out.println("\nHello");//starts from a new line
        System.out.println("Hello \n Cybertek");

        System.out.println("My favorite tv show is  \"Game of Thrones\".");

        System.out.println("\\");

        System.out.println("My favorite book is 'Java'");




    }
}
