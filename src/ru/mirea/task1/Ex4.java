package ru.mirea.task1;

public class Ex4 {

    public static void main(String[] args) {
        int n,arr[];
        n = 10;
        arr = new int [n];
        for (int i=0;i<arr.length;i++)
            arr[i] = (int) ( Math.random() * n);
        for (int i: arr)
            System.out.print( i + " " );

        System.out.println();

        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        for (int i: arr)
            System.out.print( i + " " );
    }
}
