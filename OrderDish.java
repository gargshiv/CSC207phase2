package restaurant;

import java.util.HashSet;
import java.util.Set;

public class OrderDish {
    
    private MenuItem item;
    private final Set<MenuItemMod> mods = new HashSet<>();
    
    public OrderDish(MenuItem item) {
        this.item = item;
    }
    
}
