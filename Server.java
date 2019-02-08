package restaurant;

public class Server extends Employee {
    
    public Server(Restaurant restaurant, String name) {
        super(restaurant, name);
    }

    public void deliver(Order order){
        super.getRestaurant().markOrderDelivered(order);
    }

    public void takeOrder(Order order){
        super.getRestaurant().markOrderPlaced(order);
    }
}
