package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class User {

    public UUID userID;
    List<Item> itemsBorrowedList = new ArrayList<>();
    public  boolean hasRegistered;
    abstract protected void addItem(Item item);

    public User() {
        this.userID = UUID.randomUUID();
        this.itemsBorrowedList = itemsBorrowedList;
        this.hasRegistered = hasRegistered;
    }

    public UUID getUserID() {
        return userID;
    }

    public void setUserID(UUID userID) {
        this.userID = userID;
    }

    public List<Item> getItemsBorrowedList() {
        return itemsBorrowedList;
    }

    public void setItemsBorrowedList(List<Item> itemsBorrowedList) {
        this.itemsBorrowedList = itemsBorrowedList;
    }

    public boolean isHasRegistered() {
        return hasRegistered;
    }

    public void setHasRegistered(boolean hasRegistered) {
        this.hasRegistered = hasRegistered;
    }


    }
}
