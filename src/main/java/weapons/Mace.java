package weapons;

import shared.IAttack;
import weapons.IWeapon;

public class Mace implements IWeapon {

    public void attack (IAttack defender) {
        defender.takeDamage(15);
    }
}
