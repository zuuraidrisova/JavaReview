package day18_DoWhileLoop;

public class ReverseStringDoWhile {

    public static void main(String[] args) {

        String word = "Zuura";

        String reversed = "";

        int i = word.length()-1;

        do{

            reversed += word.charAt(i);

           i--;
        }while(i >= 0);


        System.out.println("reversed = " + reversed);


    }
}
