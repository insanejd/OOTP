package protorype;

public class MainPT {

    public static void main(String[] args) {
        Product chair = new Chair(false, true, 30, 40);
        Product clonedChair = chair.clone();

        System.out.println("Стоврений об'єкт: " +chair.getInfo());
        System.out.println("Прототип: " + clonedChair.getInfo());
    }

}
