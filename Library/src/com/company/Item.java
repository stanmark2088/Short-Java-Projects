package com.company;

import java.util.UUID;

public abstract class Item {

    public String name;
    public UUID itemID;
    public Date returnDate;

    public Item(String name, Date date) {
        this.name = name;
        this.returnDate = returnDate;
    }

    public UUID getItemID() {
        return itemID;
    }

    public void setItemID(UUID itemID) {
        this.itemID = itemID;
    }

    public Date getreturnDate() {
        return returnDate ;
    }

    public void setReturnDateDate(Date date) {
        this.returnDate = returnDate;
    }
}
