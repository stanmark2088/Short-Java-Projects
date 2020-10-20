package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private static Bank sing_instance = null;
    private List<Client> clientList = new ArrayList<>();

    private Bank () {

    }

    public static Bank getInstance(){
        if(sing_instance == null)
            sing_instance = new Bank();
        return sing_instance;
    }



    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }
}
