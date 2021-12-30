package com.company;

import java.util.EnumSet;

public class Main {

    public static void main(String[] args) {
        for(Book book : Book.values()){
            System.out.println(book + " " + book.getTitle() + " "
            + book.getPublishYear());
        }
        System.out.println("أول 3 عناصر: ");
        for(Book book : EnumSet.range(Book.JAVA1,Book.ALGO)){
            System.out.println(book + " " + book.getTitle() + " "
                    + book.getPublishYear());
        }
    }
}
