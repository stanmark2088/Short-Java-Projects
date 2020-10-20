package com.company;

public class Corporate extends BankAccount {

    public Corporate(double currentBalance, String currencyInfo,Client client) {
        super(currentBalance, currencyInfo, client);
    }

    @Override
    public void transfer(BankAccount bankAccount, double amount) {

        double myBalance = getCurrentBalance();
        double balance = bankAccount.getCurrentBalance();
        myBalance -= amount;
        balance += amount;

        bankAccount.setCurrentBalance(balance);
        setCurrentBalance((myBalance));

        System.out.println("The transfer has been completed");

    }
}
