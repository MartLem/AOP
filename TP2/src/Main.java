public class Main {

    public static void main(String args[]) {
        Clients clients = new Clients();
        Client val = new Client("Valentin", "M5B10");
        Client mart = new Client("Martin", "M5B6");

        clients.addClient(val);
        clients.addClient(mart);

        Orders orders = new Orders();
        Order order1 = new Order(1, 45.5684);
        Order order2 = new Order(2, 453.234234234);
        Order order3 = new Order(3, 2.231);

        order1.printOrder();
        order2.printOrder();
        order3.printOrder();

        System.out.println(val.hasOrder());
        System.out.println(mart.hasOrder());

        val.addOrder(order1);
        val.addOrder(order2);

        mart.addOrder(order3);

        order1.printOrder();
        order2.printOrder();
        order3.printOrder();

        System.out.println(val.hasOrder());
        System.out.println(mart.hasOrder());

        val.addOrder(order3);
        order3.printOrder();

    }

}