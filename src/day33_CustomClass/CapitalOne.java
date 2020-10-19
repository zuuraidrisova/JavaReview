package day33_CustomClass;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount accountHolder = new BankAccount("Anna",28362918, 0);

        accountHolder.deposit(3298);

        accountHolder.checkBalance();

        accountHolder.withdraw(392);

        accountHolder.checkBalance();

        System.out.println(accountHolder);

    }
}
