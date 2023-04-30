package memento;

import java.util.ArrayList;
import java.util.List;

public class Cook {
    private List<Order> orders = new ArrayList<>();
    Order order;

    public void cook() {
        order = orders.stream().findFirst().orElse(null);

        System.out.println("Початок приготування замповлення для столика №" + order.getTableNumber());

        System.out.println("Приготував: " + order.getName());
        System.out.println("Видалення замовлення для столика : " + order.getTableNumber());
        removeOrder(order);
        System.out.println("Список наступних замовлень: ");

        orders.stream().forEach(order -> System.out.println("-> назва: " + order.getName() + " для столика №" + order.getTableNumber()));
        System.out.println("Залишилось замовлень: " + orders.size());
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public void restoreState(OrderMemento memento) {
        Order restoredOrder = memento.order;
        System.out.println("Відтворення видаленого замовлення для столику №" + restoredOrder.getTableNumber());
        orders.add(restoredOrder);
    }

    public int getOrdersCount() {
        return orders.size();
    }

    public List<Order> getOrders() {
        return orders;
    }
}
