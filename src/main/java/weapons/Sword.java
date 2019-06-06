package weapons;

import enemies.Enemy;
import shared.IAttack;
import weapons.IWeapon;

public class Sword implements IWeapon {

    public void attack (IAttack defender) {
            defender.takeDamage(20);
    }
}
