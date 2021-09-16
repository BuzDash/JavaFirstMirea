package ru.mirea.task1;

public class Ex11 {
    public static void main (String[] args){
        int [] m={4, 6, 81, 99, 10};
        int Sum=0;

        for (int i = 0; i < m.length; i++) {
            Sum += m[i];
        }
        System.out.println(Sum);

        int i = 0;
        while (i < 5) {
            Sum += m[i];
            i++;
        }
        System.out.println(Sum);

        int j = 0;
        do {
            Sum += m[j];
            i++;
        } while (j < 5);

        System.out.println(Sum);
    }
}

