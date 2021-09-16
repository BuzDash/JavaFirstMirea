package ru.mirea.task3;

public class Circle {
    private String color;
    private boolean filled;
    private int radius;

    Circle(){
        String color;
        boolean filled;
        int radius;
    }
    public Circle(String color, boolean filled, int radius) {
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    public String toString(){
        return  ("For this Circle: color is " + this.color + ", filled is " + this.filled + ", radius is " + this.radius + ", perimeter is ");
    }


}
