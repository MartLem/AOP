import java.util.ArrayList;
import java.util.List;

public class Clients {

    private List<Client> clients = new ArrayList<>();

    public void addClient(Client c) {
        clients.add(c);
    }

    public void delClient(Client c) {
        if (!c.hasOrder())
            clients.remove(c);
    }

}
