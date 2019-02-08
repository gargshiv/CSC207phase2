package restaurant;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    
    private final Map<String,MenuItem> items = new HashMap<>();
    
    public MenuItem getItem(String name) {
        return items.get(name);
    }
    
    public void addItem(MenuItem item) {
        items.put(item.getName(), item);
    }
    
}
