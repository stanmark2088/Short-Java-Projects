package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Client {

    private String uniqueID;
    private List<BankAccount> bankAccountList = new ArrayList<>();


    public Client(String uniqueID, List<BankAccount> bankAccountList) {
        this.uniqueID = uniqueID;
        this.bankAccountList = bankAccountList;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public List<BankAccount> getBankAccountList() {
        return bankAccountList;
    }

    public void setBankAccountList(List<BankAccount> bankAccountList) {
        this.bankAccountList = bankAccountList;
    }

    public void addBankAccount(BankAccount bankAccount){
        bankAccountList.add(bankAccount);
    }



    public boolean wireMoney(BankAccount myAccount,BankAccount bankAccount, double amount){
        if(myAccount.getCurrencyInfo() != bankAccount.getCurrencyInfo()) {
            System.out.println("Cannot wire incompatible types");
            return false;
        }
        for(BankAccount account : bankAccountList){
              if(account.getBankAccountID() == bankAccount.getBankAccountID()){
                  System.out.println("Cannot wire to the same person");
                  return false;
              }
        }
        if(myAccount.getClient().getUniqueID() == this.getUniqueID()){
            System.out.println("You cannot wire.");
            return false;
        }
        if(myAccount.getCurrentBalance() < amount){
            System.out.println("You cannot wire more money than your current balance");
            return false;
        }

        System.out.println("Transaction completed");
        return true;
    }
}
