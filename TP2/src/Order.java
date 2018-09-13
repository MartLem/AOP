public class Order {

    private int id;
    private double amount;
    private Client client;

    public Order(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public void setClient(Client c) {
        this.client = c;
    }

    public Client getClient() {
        return client;
    }

    public void printOrder() {
        System.out.printf("ID : %d\nAmount : %f\nClient : %s\n\n", id, amount, client == null ? client : client.toString());
    }

}
