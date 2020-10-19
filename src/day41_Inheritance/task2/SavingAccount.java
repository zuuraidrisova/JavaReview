package day41_Inheritance.task2;

public class SavingAccount extends BankAccount{

       /*
create sub class of BankAccount and name it SavingAccount
        variables: accountNumber, accountHolder, balance, interestRate
        methods: deposit, showBalance

        accountNumber ==> inherited
         accountHolder ==> inherited
          balance ==> inherited

           interestRate ==> declared

           deposit()==> inherited
           showBalance()==> inherited
           toString() ==> inherited

        */

    public static double interestRate;

    static {

        interestRate = 0.02;
    }

}
