package day06_ShortHand_LogicalOperators;

public class LogicalOperators {

    public static void main(String[] args) {

        /*
         &&  ==> and logic , both sides must be true

         ||  ==> or logic, one of the sides must be true

         !   ==> opposite (boolean expressions)
         */


        System.out.println(!true); //false
        System.out.println(!!true); //true

        boolean result = 10 > 10 + 15;

        System.out.println("result = " + result); //false

        System.out.println(!true == !false); //false


        boolean result2 = false && false;

        System.out.println("result2 = " + result2);


        boolean corona = "Corona Virus" != "End of the World!";

        System.out.println("corona = " + corona);

        boolean r = 10 > 15 && 15 < 13;

        System.out.println("r = " + r);

        boolean r1 = 'a' == 'b'-1 && 'b'+1 == 'c';

        System.out.println("r1 = " + r1); //true

        System.out.println(true || false); //true

        boolean r2 = true != false || false != true;

        System.out.println("r2 = " + r2);


    }

}
