public class TestOrders {
    

    public static void main (String[] args) {


        // menu items
        Item item1 = new Item("hot coffee", 2.0);
        Item item2 = new Item("cold brew", 4.0);
        Item item3 = new Item("vanilla latte", 4.5);
        Item item4 = new Item("nitro cold brew", 5.0);

        // orders
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Chris");
        Order order4 = new Order("Jones");
        Order order5 = new Order("Mark");

        // add items to the order
        order1.addItem(item1);
        order1.addItem(item2);

        order2.addItem(item2);
        order2.addItem(item1);

        order3.addItem(item4);
        order3.addItem(item4);

        order4.addItem(item2);
        order4.addItem(item3);

        order5.addItem(item3);
        order5.addItem(item3);
        order5.addItem(item4);

        //test status
        System.out.println(order1.getStatusMessage());
        order1.setReady(true);
        System.out.println(order1.getStatusMessage());

        // order total
        System.out.println(order1.getOrderTotal());
        order1.display();

    }
}
