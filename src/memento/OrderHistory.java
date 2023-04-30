package memento;

import java.util.ArrayList;
import java.util.List;

public class OrderHistory {

    private List<OrderMemento> history;

    public OrderHistory() {
        this.history = new ArrayList<>();
    }

    public List<OrderMemento> getHistory() {
        return history;
    }

    public void addOrderToHistory(OrderMemento orderMemento)  {
        history.add(orderMemento);
    }

    public void clearHistory() {
        history = new ArrayList<>();
    }
}
