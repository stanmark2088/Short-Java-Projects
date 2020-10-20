package com.company;

public class Consumer extends BankAccount{

    public Consumer(double currentBalance, String currencyInfo, Client client) {
        super(currentBalance, currencyInfo, client);
    }

    @Override
    public void transfer(BankAccount bankAccount, double amount) {
        double tax = 0.01;
        double myBalance = this.getCurrentBalance();
        double balance = bankAccount.getCurrentBalance();
        myBalance -= (amount * tax) + amount;
        balance += amount;

        bankAccount.setCurrentBalance(balance);
        setCurrentBalance((myBalance));

        System.out.println("The transfer has been completed");


    }
}
