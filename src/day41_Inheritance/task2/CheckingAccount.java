package day41_Inheritance.task2;

public class CheckingAccount extends BankAccount {

    /*
	create sub class of BankAccount and name it checkingAccount
			variables: accountNumber, accountHolder, balance
			methods: deposit, withDraw, showBalance


			accountNumber ==> inherited
			 accountHolder ==> inherited
			  balance ==> inherited


			   withDraw()==> declared

			    showBalance()==> inherited
			    deposit() ==> inherited
			    toString() ==> inherited

 */

    public void withdraw(double amount){

        balance -= amount;
    }
}
