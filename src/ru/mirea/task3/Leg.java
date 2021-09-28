package ru.mirea.task3;

public class Leg extends Human{
    private boolean exists;

    public Leg(){
        this.color = "white";
        this.side = "right";
        this.fracture = false;
        this.exists = true;
    }

    public void break_to(){
        fracture = !fracture;
    }

    public String toString(){
        break_to();
        return "The leg of this Human is "+this.color+", is in the "
                +this.side+", exists ("+this.exists+") and has ("+this.fracture+") a fracture.";
    }
}
