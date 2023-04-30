package command;

public class MainCM {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Створення замовлень\n");

        Order order = new Order("Ірландський сніданок");
        Order secondOrder = new Order("Грецький сніданок");

        Waiter waiter = new Waiter(order);
        Executor executor = new Executor();
        CookCommand command = new CookCommand(executor, order);
        CookCommand command2 = new CookCommand(executor, secondOrder);

        waiter.setCommand(command);
        waiter.takeOrder();
        waiter.removeOrder();

        waiter.setCommand(command2);
        waiter.takeOrder();
        waiter.removeOrder();
    }
}