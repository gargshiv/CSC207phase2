package restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Restaurant {
    
    private class IngredientData {
        
        private int threshold;
        private int amount;
        
        private IngredientData(int threshold, int startingAmount) {
            this.threshold = threshold;
            amount = startingAmount;
        }
        
    }
    
    private final Menu menu;
    private final Map<String,IngredientData> ingredientData = new HashMap<>();
    private final List<Table> tables;
    private final Map<String,Cook> cooks = new HashMap<>();
    private final Map<String,Server> servers = new HashMap<>();
    private final Map<String,Manager> managers = new HashMap<>();
    private final Map<String,Receiver> receivers = new HashMap<>();
    private final Set<Order> unseenOrders = new HashSet<>();
    private final Set<Order> readyOrders = new HashSet<>();
    
    public Restaurant(Menu menu, int numTables) {
        this.menu = menu;
        tables = new ArrayList<>(numTables);
        for (int i = 1; i <= numTables; i++) {
            tables.add(new Table(this, i));
        }
    }
    
    public Menu getMenu() {
        return menu;
    }
    
    public void addIngredient(String ingredient, int threshold, int startingAmount) {
        ingredientData.put(ingredient, new IngredientData(threshold, startingAmount));
    }
    
    public int getThreshold(String ingredient) {
        return ingredientData.get(ingredient).threshold;
    }
    
    public int getAmount(String ingredient) {
        return ingredientData.get(ingredient).amount;
    }
    
    public void addAmount(String ingredient, int amount) {
        if (amount < 0) {
            throw new RuntimeException("Attempted to add a negative amount of an ingredient");
        }
        IngredientData data = ingredientData.get(ingredient);
        data.amount += amount;
    }
    
    public boolean subtractAmount(String ingredient, int amount) {
        //Returns false iff there isn't enough of the ingredient to take
        if (amount < 0) {
            throw new RuntimeException("Attempted to subtract a negative amount of an ingredient");
        }
        IngredientData data = ingredientData.get(ingredient);
        if (data.amount < amount) {
            return false;
        }
        if (data.amount >= data.threshold && data.amount - amount < data.threshold) {
            //Write code to order more
        }
        data.amount -= amount;
        return true;
    }
    
    public int getNumTables() {
        return tables.size();
    }
    
    public Table getTable(int num) {
        if (num >= 1 && num <= tables.size()) {
            return tables.get(num - 1);
        }
        return null;
    }
    
    public Cook getCook(String name) {
        return cooks.get(name);
    }
    
    public Server getServer(String name) {
        return servers.get(name);
    }
    
    public Manager getManager(String name) {
        return managers.get(name);
    }
    
    public Receiver getReceiver(String name) {
        return receivers.get(name);
    }
    
    public void markOrderPlaced(Order order) {
        unseenOrders.add(order);
    }
    
    public Set<Order> getUnseenOrders() {
        return unseenOrders;
    }
    
    public void markOrderSeen(Order order) {
        unseenOrders.remove(order);
    }
    
    public void markOrderFilled(Order order) {
        readyOrders.add(order);
    }
    
    public Set<Order> getReadyOrders() {
        return readyOrders;
    }
    
    public void markOrderDelivered(Order order) {
        readyOrders.remove(order);
    }
    
}
