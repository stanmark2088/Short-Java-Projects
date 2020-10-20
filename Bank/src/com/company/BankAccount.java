package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class BankAccount {

    private String bankAccountID;
    private double currentBalance;
    private String currencyInfo;
    private Client client;




    public BankAccount(double currentBalance, String currencyInfo, Client client) {
        this.currentBalance = currentBalance;
        this.currencyInfo = currencyInfo;
        this.bankAccountID = UUID.randomUUID().toString();
        this.client = client;
        client.addBankAccount(this);
    }

    public BankAccount(double currentBalance, String currencyInfo) {
    }

    abstract public void transfer(BankAccount bankAccount, double amount);

    public String getBankAccountID() {
        return bankAccountID;
    }

    public void setBankAccountID(String bankAccountID) {
        this.bankAccountID = bankAccountID;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getCurrencyInfo() {
        return currencyInfo;
    }

    public void setCurrencyInfo(String currencyInfo) {
        this.currencyInfo = currencyInfo;
    }

    public Client getClient() {
        return client;
    }



}
