package restaurant;

public abstract class Employee {
    
    private final Restaurant restaurant;
    private final String name;
    
    public Employee(Restaurant restaurant, String name) {
        this.restaurant = restaurant;
        this.name = name;
    }
    
    public Restaurant getRestaurant() {
        return restaurant;
    }
    
    public String getName() {
        return name;
    }
    
}
