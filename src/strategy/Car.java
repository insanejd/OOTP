package strategy;

public class Car {
    protected int passengers;
    protected String model;
    private Movable movable;

    public Car(int passengers, String model, Movable movable) {
        this.passengers = passengers;
        this.model = model;
        this.movable = movable;
    }

    protected void move() {
        movable.move();
    }

    public Movable getMovable() {
        return this.movable;
    }

}
