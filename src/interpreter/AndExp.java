package interpreter;

public class AndExp implements Expression {
    private Expression firstExpression;
    private Expression secondExpression;

    public AndExp(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public boolean interpret(String info) {
        return firstExpression.interpret(info) && secondExpression.interpret(info);
    }
}
