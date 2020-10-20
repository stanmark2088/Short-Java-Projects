package com.company;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private int groupID;
    private static int groupCount;
    private String name;
    GroupLeader groupLeader;
    List<Employee> employeeList = new ArrayList<>();
    private String groupType;

    public Group(String name, GroupLeader groupLeader, String groupType) {
        this.name = name;
        this.groupLeader = groupLeader;
        this.groupType = groupType;
        this.groupID = groupCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void addEmployeeToGroup(Employee employee){
        employeeList.add(employee);
    }



    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Group{");
        sb.append("groupID=").append(groupID);
        sb.append(", name='").append(name).append('\'');
        sb.append(", groupLeader=").append(groupLeader);
        sb.append(", employeeList=").append(employeeList);
        sb.append(", groupType='").append(groupType).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
