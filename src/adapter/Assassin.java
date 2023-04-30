package adapter;

import java.util.Random;

public class Assassin {

    Random randomizer = new Random();

    public void knifeWeapon() {
        int damage = randomizer.nextInt(30) + 1;

        System.out.println("Ассасін атакував на " + damage + " дамагу");
    }

    public void sneakForward() {
        int move = randomizer.nextInt(15) + 1;

        System.out.println("Ассасін підкрався на " + move + " клітинок");
    }

    public void reactToEnemy(String name) {
        System.out.println("Ассасін починає обдумувати план для " + name);
    }
}
