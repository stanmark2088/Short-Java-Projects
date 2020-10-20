package com.company;

public class Book extends Item{

    public int numberOfPages;

    public Book(String name, Date date, int numberOfPages) {
        super(name, date);
        this.numberOfPages = numberOfPages;
    }
}
