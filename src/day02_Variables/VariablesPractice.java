package day02_Variables;

public class VariablesPractice {

    public static void main(String[] args) {

        /*
        salary, state tax rate,federal state tax ,  loan , ssn
         */

        int salary = 100000;
        double federalTax = 0.18;
        float stateTax = 0.065f;

        double totalTax = federalTax +  stateTax;

        double salaryAfterTax = salary * (1 - totalTax);

        System.out.println("salaryAfterTax = " + salaryAfterTax);

        System.out.println("========================================");

        //area of the circle :  r * r * pi;

        double r = 5.5;

        double area = r * r * 3.14;

        System.out.println("area = " + area);

        System.out.println("========================================");

        int kg = 61;
        double pound = kg * 2.25;

        System.out.println("pound = " + pound);

        System.out.println("========================================");

        double lira = 1000;
        double dollar = lira / 6.15;

        System.out.println("dollar = " + dollar);

        System.out.println("========================================");

        int liter = 1000;
        double gallons = liter / 3.7;

        System.out.println("gallons = " + gallons);

        System.out.println("========================================");

        String employeeName = "Helen";
        String companyName = "BOA";

        //String stores sequence of characters
        System.out.println("employeeName = " + employeeName);
        System.out.println("companyName = " + companyName);

        // +  is used for concatenation
        System.out.println(employeeName+" works at "+companyName);






    }
}
