package com.company;

import java.util.List;

public class Resident  extends User{

    public Resident(List<Item> itemsBorrowedList, boolean hasRegistered) {
        super(itemsBorrowedList, hasRegistered);
    }


    @Override
    protected void addItem(Item item) {
        if(isHasRegistered() && getItemsBorrowedList().size() < 5) {
            getItemsBorrowedList().add(item);
        }
    }
}
