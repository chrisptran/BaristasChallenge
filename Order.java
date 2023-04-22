import java.util.ArrayList;

public class Order {
    
    //member variables
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    // constructor
    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    //order methods
    public void addItem(Item item) {
        items.add(item);
    }

    public String getStatusMessage() {
        if(this.ready) {
            return "Your order is ready!";
        } 
        return "Your order is almost ready";
    }

    public double getOrderTotal() {
        double total = 0;
        for(Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void display() {
        System.out.println("Customer name:" + this.name);
        for (Item item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: $" + getOrderTotal());
    }


    //getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getReady() {
        return this.ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
