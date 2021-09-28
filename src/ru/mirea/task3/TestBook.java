package ru.mirea.task3;

import ru.mirea.task2.Dog;
import ru.mirea.task2.Shape;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("A.S. PUSHKIN", "Captain's daughter", 1836);
        Book b2 = new Book("E.M. Remark", "Three comrades", 1928);
        Book b3 = new Book("L.N. Tolstoy", "War and Peace", 1867);

        System.out.println(b1);
        b1.intoNow();
        System.out.println(b2);
        b2.intoNow();
        System.out.println(b3);
        b3.intoNow();
    }
}
