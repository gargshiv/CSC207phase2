package restaurant;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MenuItem {
    
    private final String name;
    private final BigDecimal price;
    private final Map<String,Integer> ingredients = new HashMap<>();
    private final Set<MenuItemMod> mods = new HashSet<>();
    
    public MenuItem(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public BigDecimal getPrice() {
        return price;
    }
    
}
