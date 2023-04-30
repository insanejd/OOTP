package memento;

public class MainMemento {

    public static void main(String[] args) throws InterruptedException {

        Order firstOrder = new Order("Ігор", new String[]{"Ірландський сніданок"}, "1");
        Order secondOrder = new Order("Олег", new String[]{"Ірландський сніданок", "Грецький сніданок"}, "2");
        Order thirdOrder = new Order("Іван", new String[]{"Грецький сніданок"}, "3");

        Cook cook = new Cook();
        Waiter waiter = new Waiter(cook);
        OrderHistory orderHistory = new OrderHistory();

        waiter.execute(firstOrder);
        orderHistory.addOrderToHistory(new OrderMemento(firstOrder));
        waiter.execute(secondOrder);
        orderHistory.addOrderToHistory(new OrderMemento(secondOrder));
        waiter.execute(thirdOrder);
        orderHistory.addOrderToHistory(new OrderMemento(thirdOrder));

        System.out.println("Кількість замовлень: " + cook.getOrdersCount());

        System.out.println("Історія замовлень: ");

        orderHistory.getHistory().stream().forEach(om -> System.out.println(
                "Замовлення для: " + om.order.getName()
                        + ", номер столика" + om.order.getTableNumber()));

        System.out.println("\nКількість замовлень: " + cook.getOrdersCount() + "\n");

        System.out.println("Відновлення");

        cook.restoreState(orderHistory.getHistory().stream().findFirst().orElse(null));

        cook.restoreState(orderHistory.getHistory().stream()
                .filter(orderMemento -> orderMemento.getOrder().getTableNumber().equals("2"))
                .findFirst().orElse(null));

        cook.restoreState(orderHistory.getHistory().stream()
                .filter(orderMemento -> orderMemento.getOrder().getTableNumber().equals("3"))
                .findFirst().orElse(null));

        System.out.println("Історія замовлень: ");
        orderHistory.getHistory().stream().forEach(om -> System.out.println(
                "Замовлення для: " + om.order.getName()
                        + ", номер столика" + om.order.getTableNumber()));

        System.out.println("\n\n\nВиконання відновлених замовлень\n\n\n");

        System.out.println("\nКількість замовлень: " + cook.getOrdersCount() + "\n");

        waiter.runResotred();
    }

}
