package day21_MultiDimensional;

import java.text.DecimalFormat;

public class DecimalFormatting {

    public static void main(String[] args) {

        // DecimalFormat is a class comes form java.text, it helps to round the decimals
        //we have to import the class to use, format must be given in String
        DecimalFormat df = new DecimalFormat("0.00");

        double a = 10.0 / 3.0;

        System.out.println("a = " + a);

        System.out.println("df.format(a) = " + df.format(a));

    }
}
