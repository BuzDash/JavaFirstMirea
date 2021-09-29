package ru.mirea.task5;

abstract class Dog {
    protected String color;
    protected String breed;
    protected int height;
    protected int weight;

    Dog(){
        String color;
        String breed;
        int height;
        int weight;
    }
    public Dog (String color, String breed, int height, int weight) {
        this.color = color;
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }


    abstract void Size();
    abstract void intoHuman();
    public String toString(){
        return  ("");
    };
    public static void main(String[] args){
        Dog h1 = new Dog1("Black", "shepherd", 80, 35, "erect", 8);
        System.out.println(h1.toString());

        Dog h2 = new Dog1("white", "poodle", 40, 5, "hanging", 1);
        System.out.println(h2.toString());

        Dog h3 = new Dog1("gold", "retriver", 75, 25, "hanging", 3);
        System.out.println(h3.toString());
    }
}
