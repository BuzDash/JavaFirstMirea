package ru.mirea.task3;

public class Hand extends Human{
    private boolean exists;

    public Hand(){
        this.color = "white";
        this.side = "right";
        this.fracture = false;
        this.exists = true;
    }

    public Hand(boolean exists){
        this.color = "white";
        this.side = "right";
        this.fracture = false;
        this.exists = exists;
    }

    public void break_to(){
        fracture = !fracture;
    }

    public String toString(){
        break_to();
        return "The hand of this Human is "+this.color+", is in the "
                +this.side+", exists ("+this.exists+") and has ("+this.fracture+") a fracture.";
    }
}
