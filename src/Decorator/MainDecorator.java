package Decorator;

public class MainDecorator {

    public static void main(String[] args) {
        Pizza bacicPizza = new TomatoSauce(new Mozzarella(new HavaiPizza()));

        System.out.println("Інградієнти: "+ bacicPizza.getDescription());
        System.out.println("Ціна: "+ bacicPizza.getCost());
    }

}
