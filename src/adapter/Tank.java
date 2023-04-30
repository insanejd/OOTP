package adapter;

import java.util.Random;

public class Tank implements EnemyWeaponAttacker {

    Random randomizer = new Random();

    @Override
    public void swordWeapon() {
        int damage = randomizer.nextInt(10) + 1;

        System.out.println("Танк атакував на " + damage + " дамагу");
    }

    @Override
    public void driveStraight() {
        int move = randomizer.nextInt(5) + 1;

        System.out.println("Танк перейшов на " + move + " клітинок");
    }

    @Override
    public void assignDriver(String name) {
        System.out.println("Гравець " + name + " керує танком");
    }
}
