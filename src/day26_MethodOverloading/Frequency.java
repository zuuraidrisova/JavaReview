package day26_MethodOverloading;

public class Frequency {

     /*
     write a return method called frequency that accepts two parameters:
     string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2
			Note: MUST use Arrays and for each loop
     */

    public static void main(String[] args) {

        String str = "AAAAB";

        char ch = 'A';

        int count = frequency(str,ch);

        System.out.println("count = " + count);
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
}
