package day04_JavaRecap;


public class VariablesPractice {

    public static void main(String[] args) {

        byte b1 = 127; //max is 127
        short s1 = b1; //short is larger so can hold byte values
        int i1 = s1; //int is larger so can hold short values
        long l1 = s1; //long is larger so can hold int values

        long l2 = 99999999999L; //L is a must to tell compiler to see it as long number

        float f1 = 4.5f;

        double d1 = f1;
        double d2 = 100.0;
        double d3 = 999999L;

        char ch1 = '$';

        System.out.println(i1 + l1 + l2);

        System.out.println("ch1 = " + ch1);

        int s = '8';

        System.out.println("s = " + s);

        char ch2 = 'z' + 8;

        System.out.println(ch2);

        System.out.println(true == false); // false
        System.out.println(1 == 2); // false
        System.out.println('a' == 'b'); // false
        System.out.println('a' == 'b' - 1); // true

        boolean b = !true;

        System.out.println("b = " + b); //false
        System.out.println(!b); //true

        System.out.println(10.0 / 4.0); // 2.5

        System.out.println(10 % 4); // 2 is remainder

        boolean evenNumber = 25 % 2 == 0;

        System.out.println("evenNumber = " + evenNumber); //false

        boolean oddNumber = 22 % 2 != 0;

        System.out.println("oddNumber = " + oddNumber); //false
    }
}
