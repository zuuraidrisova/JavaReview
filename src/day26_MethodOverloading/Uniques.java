package day26_MethodOverloading;

public class Uniques {

    public static void main(String[] args) {

        /*
     use the above method to create another called uniques that accepts a string
     parameter and returns it's unique characters as String

			Ex: uniques("ABBC"); 		==> "AC"

				uniques("Cybertek");  	==> "cybrtk"
     */
        String str = "ABBBCDD";

        String unique = uniques(str);

        System.out.println("unique = " + unique);

    }

    public static int frequency(String str, char ch){

        char chArray [] =  str.toCharArray();

        int count = 0;

        for(char each: chArray){

            if(each == ch){

                count++;
            }
        }

        return count;
    }

    public static String uniques(String str){

        String unique = "";

        for (int i = 0; i < str.length(); i++){

            int count = frequency(str, str.charAt(i));

            if (count == 1){

                unique += str.charAt(i);
            }
        }

        return  unique;
    }



}
