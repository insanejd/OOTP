package command;

public interface Command {

    void execute() throws InterruptedException;
    void undo();
}
