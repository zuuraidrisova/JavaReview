package day08_IfStatementsContinue;

public class DivisibleBy3_5 {

    public static void main(String[] args) {

        int number = 1200;

        boolean result = (number % 3 == 0 && number % 5 == 0) ?  true : false;

        System.out.println("result = " + result);

        // in ternary total number of  question mark ? and colon : must be same
    }
}
