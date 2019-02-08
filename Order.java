package restaurant;

import java.util.ArrayList;
import java.util.List;

public class Order {
    
    private Table table;
    private final List<OrderDish> dishes = new ArrayList<>();
    
    public Order(Table table, Server server) {
        this.table = table;
    }
    
    public Table getTable() {
        return table;
    }
    
    public int getNumDishes() {
        return dishes.size();
    }
    
    public OrderDish getDish(int num) {
        if (num >= 1 && num <= dishes.size()) {
            return dishes.get(num - 1);
        }
        return null;
    }
    
    public void addDish(OrderDish dish) {
        dishes.add(dish);
    }
    
}
