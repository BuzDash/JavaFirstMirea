package ru.mirea.task5;

abstract class Furniture {
    public String manufacturer;
    public int price;
    public String material;

    Furniture(){
        String  manufacturer;
        int price;
        String material;
    }

    public Furniture(String manufacturer, int price, String material) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.material = material;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public String toString(){
        return  ("");
    };

    public static void main(String[] args){

        Furniture h1 = new Table("Белая берёза", 3000, "дуб", 4, 3);
        System.out.println(h1.toString());

        Furniture h2 = new Wardrobe("Белая берёза", 6000, "металл", 2, 1, 2);
        System.out.println(h2.toString());
    }
}
