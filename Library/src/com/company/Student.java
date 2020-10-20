package com.company;

import java.util.List;

public class Student extends User {

    public Student(List<Item> itemsBorrowedList, boolean hasRegistered) {
        super(itemsBorrowedList, hasRegistered);
    }


    @Override
    protected void addItem(Item item) {
        if(isHasRegistered() && getItemsBorrowedList().size() < 3) {
            getItemsBorrowedList().add(item);
        }
    }
}
