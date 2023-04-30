package Decorator;

public class HavaiPizza implements Pizza {

    private String description;

    @Override
    public String getDescription() {
        return "Ананаси, Куряче філе, Кукурудза консервована";
    }

    @Override
    public double getCost() {
        return 120;
    }
}
