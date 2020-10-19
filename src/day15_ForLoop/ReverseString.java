package day15_ForLoop;

public class ReverseString {

    public static void main(String[] args) {

        /*
         write a program that can reverse the following string:
				String str = "Java";
				output: avaJ
			please provide two solutions:
						first solution, you MUST use substring method
						second solution, you MUST use charAt method
         */

        String str = "Java";

        String reversed = "";

        for (int i = str.length()-1; i >= 0; i-- ){

            reversed += str.charAt(i);

        }

        System.out.println("reversed = " + reversed);
    }
}
