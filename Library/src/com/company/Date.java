package com.company;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int compareDate(Date date){
        if(this.year > date.year){
            return -1;
        }else if(this.year < date.year){
            return 1;
        }else if(this.month > date.month){
            return -1;
        }else if(this.month < date.month){
            return 1;
        }else if(this.day > date.day){
            return -1;
        }else if(this.day < date.day){
            return 1;
        }
        return 0;
    }

}
