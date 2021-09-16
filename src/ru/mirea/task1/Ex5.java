package ru.mirea.task1;

public class Ex5 {
    static int Factorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(Factorial(10));
    }
}
