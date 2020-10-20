package com.company;

public class GroupLeader extends Employee{

    public GroupLeader(String name, String groupName) {
        super(name, groupName);
    }

    public int paySalary(int numberOfGroupMembers){
        return 1800 + numberOfGroupMembers * 200;
    }

}
