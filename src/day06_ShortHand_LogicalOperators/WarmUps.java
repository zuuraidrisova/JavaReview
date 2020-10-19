package day06_ShortHand_LogicalOperators;

public class WarmUps {

    public static void main(String[] args) {

        //convert gallons to liters
        //gallon = 3.785 liters, liter = 1 / 3.785

        double numberOfGallons =  1;
        double gallonsToLiters = numberOfGallons * 3.785;

        String result = numberOfGallons + " is equal to:  "+ gallonsToLiters +" liters";

        System.out.println(result);

        //convert liters to gallons

        double numberOfLiters = 100;
        double litersToGallons =  numberOfLiters / 3.785;

        String result1 = numberOfLiters +" is equal to: "+litersToGallons+" gallons";

        System.out.println(result1);

        int a = 200;

        int b = -a++ + - --a * a-- % 2;

        System.out.println("b = " + b);




    }
}


