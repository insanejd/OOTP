package Decorator;

public class TomatoSauce extends ToppingDecorator{
    public TomatoSauce(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Додавання томатного соусу");
        System.out.println("зростання ціни піци + 0.20");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + томатний соус";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.20;
    }
}
