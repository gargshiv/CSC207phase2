package restaurant;

public class Table {
    
    private Restaurant restaurant;
    private int num;
    
    public Table(Restaurant restaurant, int num) {
        this.restaurant = restaurant;
        this.num = num;
    }
    
    public Restaurant getRestaurant() {
        return restaurant;
    }
    
    public int getNum() {
        return num;
    }
    
}
