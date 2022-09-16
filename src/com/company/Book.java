package com.company;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private ArrayList<String> pages;
    public Book(){
        title = "default";
        author = "Unknown";
        pages = new ArrayList<String>();
    }

    public Book(String title) {
        this.title = title;
        author = "Unknown";
        pages = new ArrayList<String>();
    }

    public Book(ArrayList<String> pages) {
        title = "default";
        author = "Unknown";
        this.pages = new ArrayList<String>();
        this.pages.addAll(pages);
    }

    public Book(String title, ArrayList<String> pages) {
        this.title = title;
        author = "Unknown";
        this.pages = new ArrayList<String>();
        this.pages.addAll(pages);
    }

    public Book(ArrayList<String> pages, String author) {
        this.author = author;
        title = "unknown";
        this.pages = new ArrayList<String>();
        this.pages.addAll(pages);
    }

    public Book(String title, String author, ArrayList<String> pages) {
        this.title = title;
        this.author = author;
        this.pages = new ArrayList<String>();
        this.pages.addAll(pages);
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = new ArrayList<String>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages_count() {
        return pages.size();
    }

    public void addPage(String page) {
        pages.add(page);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    protected void finalize(){
        pages.clear();
    }

    @Override
    public String toString() {
       String str = "Author: " + author + "\nTitle: " + title + "\nPages: " + pages.size();
        for (String page: pages
             ) {
            str += "\n" + page;
        }
        return str;
    }
}
