package com.company;

public enum Book {
    JAVA1("Java programming 1", "2010"),
    JAVA2("Advanced java programming", "2021"),
    ALGO("Algorithms book", "2020"),
    SQL("SQL and databases", "2019");

    private final String title;
    private final String publishYear;
    Book(String title, String publishYear){
        this.title = title;
        this.publishYear = publishYear;
    }

    public String getTitle() {
        return title;
    }

    public String getPublishYear() {
        return publishYear;
    }
}
