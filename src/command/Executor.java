package command;

import java.util.ArrayList;
import java.util.List;

public class Executor {

    private List<Order> orders = new ArrayList<Order>();

    public void execute() throws InterruptedException {

        for (Order order: orders) {
            System.out.println(String.format("Початок виконання: %s", order.getDescription() ));
            System.out.println(String.format("Замовлення готове"));
        }

    }

    public void removeOrder(Order order) {

        if (orders.remove(order)) {
            System.out.println("Замовлення видалено");
        } else {
            System.out.println("Видалити замовлення неможливо - воно не існує");
        }

    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }
}
