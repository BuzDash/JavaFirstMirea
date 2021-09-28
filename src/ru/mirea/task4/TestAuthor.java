package ru.mirea.task4;

public class TestAuthor {
    public static void main (String[] args){
        Author a1 = new Author("Ivan", "ivan@mail.ru", 'm');
        System.out.println(a1);

        Author a2 = new Author("Darya", "dashka@mail.ru", 'f');
        System.out.println(a2);

    }
}
