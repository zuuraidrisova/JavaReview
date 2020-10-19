package day09_Ternary_NestedIf;

public class Ternary {

    public static void main(String[] args) {

        /*
        Ternary: short hand if else statements

        variable = (condition) ? expressionTrue :  expressionFalse;

        ? means if keyword
        : means else keyword

         */
        int number = 5;

        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("result = " + result);

        int age = 18;

        String result2 = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";

        System.out.println("result2 = " + result2);

        int num1 = 1000;
        int num2 = 871;

        int maxNumber = (num1 > num2) ? num1 : num2;

        System.out.println("maxNumber = " + maxNumber);

        String str = (true) ? "Hello" : "Hola";

        System.out.println("str = " + str);

       String greater = (10 > 9) ? "10 is greater" : "9 is greater";

        System.out.println("greater = " + greater);

        String canBuyAlcohol = (age >= 21) ? "Can buy alcohol" : "Cannot buy alcohol";

        System.out.println("canBuyAlcohol = " + canBuyAlcohol);

    }
}
