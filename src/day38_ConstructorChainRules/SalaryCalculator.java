package day38_ConstructorChainRules;

public class SalaryCalculator {

     /*
    Create class called SalaryCalculator
            instance variables:
                hourlyRate, weeklyHours, stateTaxRate, federalTaxRate
            add a constructor can initialize those fields

     */

    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;

    public SalaryCalculator(double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate){

        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;

    }

   // instance methods
    //    salary(): returns the total salary as double

    public double salary(){//annual income

        int weeksYearly = 48;
        return hourlyRate * weeklyHours * weeksYearly;
    }

    //stateTax(): returns the total state tax as double

    public double stateTax(){//total tax paid to the state

        return salary() * stateTaxRate;
    }


    // federalTax(): returns the total federal tax as double

    public double federalTax(){//total tax paid to the federal

        return salary() * federalTaxRate;
    }

    // salaryAftertax(): retuns the salary after tax as double

    public double salaryAfterTax(){ //income after tax

        return salary() - (stateTax()+ federalTax());
    }

    // toString(): returns the hourlyRate, weeklyHours and salary
    //                 info as calculated by salary()

    public String toString(){

        return   "Hourly Rate: $"+ hourlyRate+
                "\nWeekly Hours: "+ weeklyHours+
                "\nGross Salary: $"+ salary()+
                "\nState Tax: $"+ stateTax()+
                "\nFederal Tax: $"+ federalTax()+
                "\nNet Salary: $"+ salaryAfterTax();
    }


}

class EmployeeSalary{

    public static void main(String[] args) {

        SalaryCalculator employee1 = new SalaryCalculator(45,40,0.08, 0.20);

        System.out.println("employee1 = " + employee1);

        System.out.println("===================================================");

        SalaryCalculator employee2 = new SalaryCalculator(65, 40, 0.09,0.26);

        System.out.println("employee2 = " + employee2);

        System.out.println("===================================================");

        System.out.println("gross = " + employee1.salary());

        System.out.println("gross = " + employee2.salary());
    }
}