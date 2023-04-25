public class TestOrders {
    

    public static void main (String[] args) {

        CoffeeKiosk coffeeKiosk = new CoffeeKiosk();

        coffeeKiosk.addMenuItem("coffee", 1.9);
        coffeeKiosk.addMenuItem("vanilla latte", 5.0);
        coffeeKiosk.addMenuItem("cold brew", 6.0);
        coffeeKiosk.addMenuItem("muffin", 4.0);
        coffeeKiosk.addMenuItem("scone", 4.6);

        coffeeKiosk.newOrder();

    }
}
