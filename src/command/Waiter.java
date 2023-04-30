package command;

public class Waiter {

    Command command;
    Order order;

    public Waiter(Order order) {
        this.order = order;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void takeOrder() throws InterruptedException {
        command.execute();
    }

    public void removeOrder() {
        command.undo();
    }
}
