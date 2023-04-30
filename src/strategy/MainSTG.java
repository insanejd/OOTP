package strategy;

public class MainSTG {
    public static void main(String[] args) {
        System.out.println("Створення електричної машини");

        Car electricCar = new Car(4, "S", new ElectricMove());

        electricCar.move();

        System.out.println("\nСтворення бензинової машини");

        Car petrolCar = new Car(4, "M", new PetrolMove());

        petrolCar.move();

    }
}