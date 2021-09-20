package cz.uhk.algds;

import cz.uhk.algds.Models.PizzaMenu;
import cz.uhk.algds.Models.PizzaMenuItem;

public class Main {
    public static void main(String[] args) {
       PizzaMenu menu = new PizzaMenu();
       menu.addItem(new PizzaMenuItem("Šunková", "Fakt dobrá", 150));
       menu.addItem(new PizzaMenuItem("Sýrová", "Nedobrá pizza", 160));

       for (PizzaMenuItem item : menu.getItems()){
           System.out.println(item);
       }
    }
}
