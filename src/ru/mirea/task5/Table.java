package ru.mirea.task5;

public class Table extends Furniture{
    private int surface;
    private int legs;

    public Table(String manufacturer, int price, String material, int legs, int surface) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.material = material;
        this.legs = legs;
        this.surface = surface;
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface){
        this.surface = surface;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs){
        this.legs = legs;
    }
    @Override
    public String toString() {
        System.out.println("Вид изделия: стол");
        System.out.println("Производитель: "+this.manufacturer);
        System.out.println("Цена: "+this.price);
        System.out.println("Материал: "+this.material);
        System.out.println("Поверхность: "+this.surface+ " кв м");
        System.out.println("Количество ножек: "+this.legs+ " шт");
        return "----------------------------";
    }
}
