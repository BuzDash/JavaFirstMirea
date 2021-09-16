package ru.mirea.task2;

public class Ball {
    private String name;
    private int diameter;

    public Ball(String n, int a) {
        name = n;
        diameter = a;
    }
    public Ball(String n) {
        name = n;
        diameter = 0;
    }
    public Ball() {
        name = "Ball";
        diameter = 0;
    }
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getDiameter() {
        return diameter;
    }
    public String toString() {
        return this.name+", diameter "+this.diameter;
    }
    public void intoRad() {
        System.out.println (name+" the size in radius is "+diameter/2+" centimeters");
    }
}
