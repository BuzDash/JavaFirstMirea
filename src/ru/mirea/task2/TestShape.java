package ru.mirea.task2;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape("RED", false);
        System.out.println(s1);
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());

        Shape s2 = new Shape("BLUE", true);
        System.out.println(s2);
        System.out.println(s2.getColor());
        System.out.println(s2.isFilled());

        Shape s3 = new Shape("BLACK", true);
        System.out.println(s3);
        System.out.println(s3.getColor());
        System.out.println(s3.isFilled());
    }
}
