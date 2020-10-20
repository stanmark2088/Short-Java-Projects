package com.company;

import java.util.Date;

public abstract class Employee {

    private String name;
    private Date birthday;
    private int salary;

    public Employee(String name, Date birthday, int salary) {
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double salaryAfterTax(){
        double taxedSalary = (double) (salary * 0.99);
        return taxedSalary;
    }
}
