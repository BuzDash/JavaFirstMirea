package ru.mirea.task5;

public class Wardrobe extends Furniture{
    private int width;
    private int depth;
    private int height;

    public Wardrobe(String manufacturer, int price, String material, int width, int depth, int height) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.material = material;
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth){
        this.depth = depth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    @Override
    public String toString() {
        System.out.println("Вид изделия: гардероб");
        System.out.println("Производитель: " + this.manufacturer);
        System.out.println("Цена: " + this.price);
        System.out.println("Материал: " + this.material);
        System.out.println("Ширина: " + this.width + " м");
        System.out.println("Высота: " + this.depth + " м");
        System.out.println("Длина: " + this.height + " м");
        return "----------------------------";
    }
}