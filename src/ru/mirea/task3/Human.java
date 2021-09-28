package ru.mirea.task3;

public class Human {
    public String color;
    public String side;
    public boolean fracture;

    Human() {
        String color;
        String side;
        boolean fracture;
    }

    public Human (String color, String side, boolean fracture) {
        this.color = color;
        this.side = side;
        this.fracture = fracture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public boolean isFracture() {
        return fracture;
    }

    public void setFracture(boolean fracture) {
        this.fracture = fracture;
    }

    public String toString(){
        return  ("");
    };

    public static void main(String[] args){
        Human h1 = new Head();
        System.out.println(h1.toString());

        Human h2 = new Hand();
        System.out.println(h2.toString());

        Human h3 = new Leg();
        System.out.println(h3.toString());
    }
}
