package com.company.employee;
import com.company.Person;

import java.util.Date;

public abstract class Employee extends Person {

    private int salary;

    public Employee(String name, Date birthday, String phoneNumber) {
        super(name, birthday, phoneNumber);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
