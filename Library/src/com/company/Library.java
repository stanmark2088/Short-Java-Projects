package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Library {

    public List<Item> itemList = new ArrayList<>();
    public List<User> userList = new ArrayList<>();


    public Library(List<Item> itemList, List<User> userList) {
        this.itemList = itemList;
        this.userList = userList;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public void addItem(Item item){
        itemList.add(item);
    }

    public void addUser(User user){
        if(!user.hasRegistered){
            userList.add(user);
        }else {
            System.out.println("This user already exists.");
        }
    }



    public String returnedOnDeadline(){
        Date currentDate = new Date(31,8,2020);
        for(Item item: itemList){
            if(item.returnDate.compareDate(currentDate) != -1)){
                System.out.println("fewf");
            }
        }
        System.out.println("ewf");
    }





}
