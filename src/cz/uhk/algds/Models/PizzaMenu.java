package cz.uhk.algds.Models;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
public class PizzaMenu {
    private List<PizzaMenuItem> items;
    private LocalDateTime lastUpdate;
    public PizzaMenu(){
        items = new ArrayList<>();
    }
    public List<PizzaMenuItem> getItems() {
        return items;
    }
    public void addItem(PizzaMenuItem item){
        items.add(item);
        lastUpdate = LocalDateTime.now();
    }
    public int itemsCount(){
        return items.size();
    }
    public LocalDateTime getLastUpdate(){
        return lastUpdate;
    }

}
