package day33_CustomClass;

public class BankAccount {

    /*
    create a custom class for BankAccount
    attributes/data that can have are:
            1. AccountHolder, 2. AccountNumber, 3. Balance
    Actions: showBalance, deposit, withdraw
    requirements:
            1. user should be able to deposit money into their account
			2. user should be able to withdraw money from their account
					2.1 if the withdrawing account is greater than available
					 balance, 35$ penalty charge will be added
					2.2 if the balance is less than or equal to 0, user
					 should not be able to withdraw money
			3. user should be able to see their balance


 */

    String accountHolder;
    long accountNumber;
    double balance;
    int penalty = 35;

    public BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void checkBalance(){

        System.out.println("Available balance is $"+balance);
    }

    public void withdraw(double amount){

        if(balance <= 0){

            System.out.println("You do not have enough balance in your account!");

        }else if(amount > balance){
            balance -= penalty;
            System.out.println("You are charged $"+penalty);

        }else {
            System.out.println("Withdrawing $" + amount);
            balance -= amount;
        }
    }

    public void deposit(double amount){

        System.out.println("Depositing $"+amount);

        balance += amount;
    }

    @Override
    public String toString() {
        return "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance;
    }
}
