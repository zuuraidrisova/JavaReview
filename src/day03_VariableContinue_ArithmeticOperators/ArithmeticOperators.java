package day03_VariableContinue_ArithmeticOperators;

public class ArithmeticOperators {

    public static void main(String[] args) {

        /*

        + : addition
        - : substraction
        / : division
        * : multiplication
        % : remainder

        in division you cannot divide to zero( denominator cannot be zero )

         */

        System.out.println(3 + 9);

        System.out.println(10 - 2);

        System.out.println(10 * 3);

        System.out.println(10 / 2);

        System.out.println(10 % 4); // 2

        int result = 10 % 3;

        System.out.println("result = " + result);

        System.out.println(10 / 4); // 2
        System.out.println(10.0 / 4); // 2.5
        System.out.println(10 / 4.0); // 2.5

        double d1 =  10 / 4; // 2.0

        System.out.println("d1 = " + d1);

        double d2 = 10 / 4.0f; // 2.5

        System.out.println("d2 = " + d2);
    }
}
