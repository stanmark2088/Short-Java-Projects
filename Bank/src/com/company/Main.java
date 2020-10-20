package com.company;

public class Main {

    public static void main(String[] args) {


        Bank Transilvania = Bank.getInstance();

        Client client1 = new Client();
        Client client2 = new Client();

        Consumer consumer1 = new Consumer(1250,"USD",client1);
        Consumer consumer2 = new Consumer(1550,"USD",client2);

        Corporate corporate1 = new Corporate(1500,"USD", client1);
        Corporate corporate2 = new Corporate(1500,"USD", client2);

        client1.addBankAccount(consumer1);

    }
}
