package interpreter;

public class OrExp implements Expression {
    private Expression firstExpression;
    private Expression secondExpression;

    public OrExp(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public boolean interpret(String info) {
        return firstExpression.interpret(info) || secondExpression.interpret(info);
    }
}
