package ru.mirea.task5;
import java.util.Objects;

public class Pot extends Dish {
    protected boolean lid;

    public Pot(String color, String type,  boolean whole, boolean lid){
        this.color = color;
        this.type = type;
        this.whole = whole;
        this.lid = lid;
    }

    public boolean isLid() {
        return lid;
    }
    public void setLid(boolean lid) {
        this.lid = lid;
    }
    @Override
    public void Paint() {
        if (Objects.equals(color, "red")){
            System.out.println("This pot was repainted from red to blue");
            color = "blue";
        }
        if (Objects.equals(color, "black")){
            System.out.println("This pot was repainted from black to white");
            color = "white";
        }

    }
    @Override
    public void Create() {
        if (!lid){
            System.out.println("Need to buy a lid for this pot");
            lid = true;
        }
    }
    @Override
    public String toString() {
        if (whole){
            Paint();
            Create();
            return "Dish: "+this.color+" "+this.type+" with lid";
        }
        else {return "You don't have a "+this.color+" "+this.type+" with a lid";}
    }
}
