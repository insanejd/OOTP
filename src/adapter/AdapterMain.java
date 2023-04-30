package adapter;

public class AdapterMain {

    public static void main(String[] args) {
        Tank tank = new Tank();

        Assassin assassin = new Assassin();

        EnemyWeaponAttacker enemyWeaponAttacker = new AssassinAdapter(assassin);

        System.out.println("Ассасін");

        assassin.knifeWeapon();
        assassin.sneakForward();
        assassin.reactToEnemy("Олег");

        System.out.println("Танк");

        tank.swordWeapon();
        tank.driveStraight();
        tank.assignDriver("Ігор");

        System.out.println("Ассасін адаптер");

        enemyWeaponAttacker.assignDriver("Влад");
        enemyWeaponAttacker.swordWeapon();
        enemyWeaponAttacker.driveStraight();
    }
}
