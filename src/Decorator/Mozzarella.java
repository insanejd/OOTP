package Decorator;

public class Mozzarella extends ToppingDecorator {
    public Mozzarella(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Додавання моцарелли");
        System.out.println("зростання ціни піци + 0.50");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + моцарелла";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.50;
    }
}
