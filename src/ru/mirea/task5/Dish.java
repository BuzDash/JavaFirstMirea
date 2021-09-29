package ru.mirea.task5;
import java.util.Objects;

abstract class Dish {
    protected String color;
    protected String type;
    protected boolean whole;

    Dish(){
        String color;
        String type;
        boolean whole;
    }
    public Dish (String color, String type, boolean whole) {
        this.color = color;
        this.type = type;
        this.whole = whole;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public boolean isWhole() {
        return whole;
    }
    public void setWhole(boolean whole) {
        this.whole = whole;
    }


    abstract void Paint();
    abstract void Create();
    public String toString(){
        return  ("");
    };
    public static void main(String[] args){
        Dish h1 = new Cup("red", "cup", false, true);
        System.out.println(h1.toString());

        Dish h2 = new Pot("white", "pot", true, false);
        System.out.println(h2.toString());

        Dish h3 = new Cup("blue", "cup", true, false);
        System.out.println(h3.toString());

        Dish h4 = new Pot("black", "pot", true, true);
        System.out.println(h4.toString());
    }
}
