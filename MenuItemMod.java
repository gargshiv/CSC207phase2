package restaurant;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MenuItemMod {
    
    private final String name;
    private final BigDecimal priceChange;
    private final Map<String,Integer> ingredientChanges = new HashMap<>();
    
    public MenuItemMod(String name, BigDecimal priceChange) {
        this.name = name;
        this.priceChange = priceChange;
    }
    
    public String getName() {
        return name;
    }
    
    public BigDecimal getPriceChange() {
        return priceChange;
    }
    
    public int getIngredientChange(String ingredient) {
        return ingredientChanges.getOrDefault(ingredient, 0);
    }
    
    public void setIngredientChange(String ingredient, int change) {
        ingredientChanges.put(ingredient, change);
    }
    
}
