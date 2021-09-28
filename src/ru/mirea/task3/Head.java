package ru.mirea.task3;

public class Head extends Human{
    private String hair;
    private boolean exists;

    public Head(){
        this.color = "white";
        this.side = "center";
        this.fracture = false;
        this.hair = "long";
        this.exists = true;
    }

    public Head(String color, String side, boolean fracture, String hair, boolean exists) {
        this.color = color;
        this.side = side;
        this.fracture = fracture;
        this.hair = hair;
        this.exists = exists;
    }

    public void break_to(){
        fracture = !fracture;
    }

    public String toString(){
        return "The head of this Human is "+this.color+", is in the "
                +this.side+", has "+this.hair+" hair, "+this.exists+" and has ("+this.fracture+") a fracture.";
    }
}
