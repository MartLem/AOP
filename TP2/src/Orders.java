import java.util.ArrayList;
import java.util.List;

public class Orders {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order o) {
        orders.add(o);
    }

    public void delOrder(Order o) {
        orders.remove(o);
    }
}
