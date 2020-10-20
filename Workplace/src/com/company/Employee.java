package com.company;

public abstract class Employee {

    private int employeeID;
    private static int employeeCount = 1;
    private String name;
    private String groupName;
    public int monthlySalary;

    public Employee(String name, String groupName) {
        this.name = name;
        this.groupName = groupName;
        this.employeeID = employeeCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("employeeID=").append(employeeID);
        sb.append(", name='").append(name).append('\'');
        sb.append(", groupName='").append(groupName).append('\'');
        sb.append(", monthlySalary=").append(monthlySalary);
        sb.append('}');
        return sb.toString();
    }
}
