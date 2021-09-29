package ru.mirea.task5;
import java.util.Objects;

public class Dog1 extends Dog {
    protected String ears;
    protected int year;

    public Dog1(String color, String breed, int height, int weight, String ears, int year){
        this.color = color;
        this.breed = breed;
        this.height = height;
        this.weight = weight;
        this.ears = ears;
        this.year = year;
    }


    public String getEars() {
        return ears;
    }
    public void setEars(String ears) {
        this.ears = ears;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    @Override
    public void Size() {
        if (weight > 15){
            System.out.println("This is a big dog");
        }
        else
            System.out.println("This is a small dog");

    }
    @Override
    public void intoHuman() {
        int k;
        k = this.year*7;
        System.out.println("In human years "+ k);
    }
    @Override
    public String toString() {
        Size();
        intoHuman();
        return "This dog is a " +this.color+" "+this.breed+" "+this.height+" cm in height and "
                +this.weight+" kg in weight, with a "+this.ears+" ears. "+this.year+" year.";
    }
}
