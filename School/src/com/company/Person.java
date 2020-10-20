package com.company;

import java.util.Date;

public abstract class Person {

    private String name;
    private Date birthday;
    private String phoneNumber;

    public Person(String name, Date birthday, String phoneNumber) {
        this.name = name;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", birthday=").append(birthday);
        sb.append(", phoneNumber='").append(phoneNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
