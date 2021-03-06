package cz.uhk.algds.Models;

public class PizzaMenuItem {
    private String name;
    private String description;
    private int price;

    public PizzaMenuItem(String name, String description, int price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " - " + description + " - " + price + " Kč ";
    }

}