package day41_Inheritance;

public class BankAccount {

     /*
    create custom class called BankAccount for Bank of America' bank accounts:
			public variables:  bankName, firstName, lastName
	 		private variables: accountHolder, accountNumber, balance
	 		encapsulate all the private data
	 				(DO NOT USE SHORTCUT)
	 		create a constructor that can initialize firstName and fullName
	 				(DO NOT USE SHORTCUT)
	 		action:
	 				depositing
	 				withdrawing
	 				availablebalance
	 				toString: returns the full name and balance
     */

    public static String bankName = "Bank Of America";
    public String firstName;
    public String lastName;
    public String fullName;

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String firstName, String lastName){

        this.firstName = firstName;
        this.lastName = lastName;


       fullName = firstName +" "+ lastName;
    }

    public String getAccountHolder(){

        return accountHolder;
    }

    public long getAccountNumber(){

        return  accountNumber;
    }

    public double getBalance(){

        return balance;
    }

    public void setAccountHolder(String firstName, String lastName){

        accountHolder = fullName;
    }

    public void setAccountNumber(long accountNumber){

        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){

        this.balance = balance;
    }


    public void deposit(double amount){

        balance += amount;
       // setBalance(balance + amount); this way also works
    }

    public void withdraw(double amount){

        //balance -= amount; this way also works

        setBalance(balance - amount);
    }

    public double checkBalance(){

        //return balance; also works
        return getBalance();
    }


    public String toString(){

        return  fullName+" : $"+balance;
    }


}

class BOA{

    public static void main(String[] args) {

        BankAccount account = new BankAccount("Zuura", "Idrisova");

        System.out.println("account = " + account);

        System.out.println("account.getAccountHolder() = " + account.getAccountHolder());

        account.setAccountHolder("Zuura","Idrisova");

        System.out.println("account.getAccountHolder() = " + account.getAccountHolder());

        System.out.println("account.getBalance() = " + account.getBalance());

        System.out.println("account.checkBalance() = " + account.checkBalance());

        account.deposit(1200);

        System.out.println("account.checkBalance() = " + account.checkBalance());

        account.withdraw(200);

        System.out.println("account.checkBalance() = " + account.checkBalance());

        System.out.println("account.getBalance() = " + account.getBalance());
    }
}