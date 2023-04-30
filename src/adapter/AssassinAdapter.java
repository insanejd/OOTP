package adapter;

public class AssassinAdapter implements EnemyWeaponAttacker {

    Assassin assassin;

    public AssassinAdapter(Assassin assassin) {
        this.assassin = assassin;
    }

    @Override
    public void swordWeapon() {
        assassin.knifeWeapon();
    }

    @Override
    public void driveStraight() {
        assassin.sneakForward();
    }

    @Override
    public void assignDriver(String name) {
        assassin.reactToEnemy(name);
    }
}
