package weapons;

import shared.IAttack;
import weapons.IWeapon;

public class Axe implements IWeapon {

    public void attack (IAttack defender) {
        defender.takeDamage(25);
    }

}
