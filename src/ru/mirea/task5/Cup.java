package ru.mirea.task5;
import java.util.Objects;

public class Cup extends Dish {
    protected boolean handle;

    public Cup(String color, String type,  boolean whole, boolean handle){
        this.color = color;
        this.type = type;
        this.whole = whole;
        this.handle = handle;
    }

    public boolean isHandle() {
        return handle;
    }
    public void setHandle(boolean handle) {
        this.handle = handle;
    }
    @Override
    public void Paint() {
        if (Objects.equals(color, "red")){
            System.out.println("This cup was repainted from red to blue");
            color = "blue";
        }
        if (Objects.equals(color, "black")){
            System.out.println("This cup was repainted from black to white");
            color = "white";
        }

    }
    @Override
    public void Create() {
        if (!handle){
            System.out.println("Need to make a handle for this cup");
            handle = true;
        }
    }
    @Override
    public String toString() {
        if (whole){
            Paint();
            Create();
            return "Dish: "+this.color+" "+this.type+" with handle";
        }
        else {return "You don't have a "+this.color+" "+this.type+" with a handle";}
    }
}
