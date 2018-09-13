import java.util.ArrayList;
import java.util.List;

public class Client {

    private String name;
    private String address;
    private List<Order> orders = new ArrayList<>();

    public Client(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addOrder(Order o) {
        if (o.getClient() == null) {
            o.setClient(this);
            orders.add(o);
        }
    }

    public boolean hasOrder() {
        return !orders.isEmpty();
    }

    public void delOrder(Order o) {
        o.setClient(null);
        orders.remove(o);
    }

    public String toString() {
        return "Name: " + name + ", address: " + address;
    }
}
