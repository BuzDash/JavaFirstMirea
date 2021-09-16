package ru.mirea.task2;

public class Book {
    private String author;
    private int page;

    public Book(String n, int a) {
        author = n;
        page = a;
    }

    public Book(String n){
        author = n;
        page = 0;
    }

    public Book(){
        author = "Nobody";
        page = 0;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public String getAuthor() {
        return author;
    }
    public int getPage() {
        return page;
    }
    public String toString() {
        return this.author+", number of page: "+this.page;
    }
    public void intoTom() {
        System.out.println (author+" wrote about "+page/300+" volumes");
    }
}
