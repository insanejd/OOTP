package command;

public class CookCommand implements Command {

    Executor executor;
    Order order;

    public CookCommand(Executor executor, Order order) {
        this.executor = executor;
        this.order = order;
    }

    @Override
    public void execute() throws InterruptedException {
        executor.addOrder(order);
        executor.execute();
    }

    @Override
    public void undo() {
        executor.removeOrder(this.order);
    }
}
