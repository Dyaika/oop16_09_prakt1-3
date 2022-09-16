package com.company;

import java.util.ArrayList;

public class TestBook {
    public static void test(){
        ArrayList<String> text = new ArrayList<String>();
        text.add("random text 1");
        text.add("random text 2");
        text.add("random text 3");
        Book[] books = new Book[7];
        books[0] = new Book();
        books[1] = new Book("Something", text);
        books[2] = new Book(text, "U.N. Owen");
        books[3] = new Book("Something", "U.N. Owen");
        books[4] = new Book(text);
        books[5] = new Book("Something");
        books[6] = new Book("Something", "U.N. Owen", text);
        for (int i = 0; i < 7; i++){
            System.out.println(books[i] + "\n");
        }
    }
}
