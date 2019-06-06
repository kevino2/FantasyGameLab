package enemies;

import weapons.IWeapon;

public class Troll extends Enemy {

    IWeapon weapon;

    public Troll(String name, int health, IWeapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }


    public IWeapon getWeapon() {
        return weapon;
    }




}
