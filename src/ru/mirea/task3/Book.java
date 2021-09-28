package ru.mirea.task3;

public class Book {
    private String author;
    private String name;
    private int year;

    public Book(String n, String k, int a) {
        author = n;
        name = k;
        year = a;
    }

    public Book(String n, String k){
        author = n;
        name = k;
        year = 1865;
    }

    public Book(){
        author = "A.S. Pushkin";
        name = "Captain's daughter";
        year = 1836;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }
    public String toString() {
        return this.author+" wrote the book "+this.name+" in "+this.year;
    }
    public void intoNow() {
        System.out.println ("It was "+ (2021-this.year)+ " years ago.");
    }
}
