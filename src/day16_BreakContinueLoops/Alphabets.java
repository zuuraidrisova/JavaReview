package day16_BreakContinueLoops;

public class Alphabets {

    public static void main(String[] args) {

        String upper = "";
        String lower = "";

        for(char ch = 'A'; ch <= 'Z'; ch++){

            upper += ch;
        }

        for(char ch = 'z'; ch >= 'a'; ch--){

            lower += ch;
        }

        System.out.println("upper = " + upper);
        System.out.println("lower = " + lower);

        String result = "";

        for(int i = 0; i <= upper.length()-1; i++){

            result += upper.charAt(i)+""+lower.charAt(i)+" ";

        }

        System.out.println("result = " + result);


    }
}
