package weapons;

import enemies.Enemy;
import shared.IAttack;

public interface IWeapon {

    void attack(IAttack defender);

}
