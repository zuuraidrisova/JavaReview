package day03_VariableContinue_ArithmeticOperators;

public class WarmUp {

    public static void main(String[] args) {

        //salary calculator
        /*
         rate = 55
         stateTax = 0.04
         federalTax = 0.22
         weeklyHours = 40
         */

        double hourlyRate = 45.50;
        float stateTaxRate = 0.04f;
        double federalTaxRate = 0.22;
        byte weeklyHours =  40;
        byte weeks = 48;

        //salary = hourlyRate * weeklyHours * 52;

        double salary = hourlyRate * weeklyHours * weeks;

        double totalTax = stateTaxRate+ federalTaxRate;

        double salaryAfterTax = salary * (1 - totalTax);

        System.out.println("salary = " + salary);

        System.out.println("totalTax = " + totalTax);

        System.out.println("salaryAfterTax = " + salaryAfterTax);


        System.out.println("===================================");


        double stateTax = salary * stateTaxRate;

        double federalTax = salary * federalTaxRate;

        double income =  salary - stateTax - federalTax;

        System.out.println("stateTax = " + stateTax);

        System.out.println("federalTax = " + federalTax);

        System.out.println("income = " + income);


        System.out.println("===================================");


        System.out.println("Your salary is: $"+salary);
        System.out.println("State tax is: $"+stateTax);
        System.out.println("Federal tax is: $"+federalTax);
        System.out.println("Total tax is: $"+(stateTax+federalTax));
        System.out.println("Salary after tax is: $"+salaryAfterTax);

    }

}
