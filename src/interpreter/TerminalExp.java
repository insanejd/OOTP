package interpreter;

public class TerminalExp implements Expression {
    private String data;

    public TerminalExp(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String info) {
        return info.contains(data) ? true : false;
    }
}
