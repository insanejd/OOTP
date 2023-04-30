package memento;

public class Waiter {

    Cook cook;

    public Waiter(Cook cook) {
        this.cook = cook;
    }

    public void execute(Order order) {
        cook.addOrder(order);
        cook.cook();
    }

    public void runResotred() {
        int ordersCount = cook.getOrdersCount();

        for (int i = 1; i <= ordersCount; i++) {
            cook.cook();
        }
    }

    public void removeOrder(Order order) {
        System.out.println("Відміна замовлення \""+order.getName()+"\" для столика: " + order.getTableNumber());
        cook.removeOrder(order);
    }

    public void undo(OrderMemento memento) {
        cook.restoreState(memento);
    }
}
