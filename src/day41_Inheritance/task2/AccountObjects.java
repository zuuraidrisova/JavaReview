package day41_Inheritance.task2;

public class AccountObjects {

    public static void main(String[] args) {

        CheckingAccount checking = new CheckingAccount();

        checking.showBalance();//currently no balance

        checking.accountHolder = "Zuura";
        checking.accountNumber = 3892461;

        checking.deposit(1200);

        checking.showBalance();

        checking.withdraw(200);

        checking.showBalance();

        System.out.println("checking = " + checking);

        System.out.println("===============================================");

        SavingAccount saving = new SavingAccount();

        saving.showBalance();

        System.out.println("saving.interestRate = " + saving.interestRate);

        saving.accountHolder = "Sary";
        saving.accountNumber = 3726481;

        saving.deposit(1200);

        saving.showBalance();

        System.out.println("saving = " + saving);

        //we can not withdraw from saving account because we dont have that method in this class

    }
}
