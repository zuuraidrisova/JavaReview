package day23_CustomMethods;

public class ReverseStringMethod {


    public static void main(String[] args) {

        String name = "Zuura";

       String reversed =  reverseString(name);


        System.out.println("reversed = " + reversed);
    }

    public static String reverseString(String str){

        String reversed = "";

        for(int i = str.length()-1; i >= 0; i --){

            reversed += str.charAt(i);
        }

        return reversed;

    }
}
