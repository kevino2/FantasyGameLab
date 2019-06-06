package players;

import weapons.IWeapon;

public class Barbarian extends Players {

      IWeapon weapon;


    public Barbarian(String name, int health, IWeapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }


}
