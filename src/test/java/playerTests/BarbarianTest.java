package playerTests;

import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import weapons.Axe;
import weapons.IWeapon;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {


    Barbarian barbarian;
    Troll troll;
    IWeapon longsword;
    IWeapon axe;
    @Before
    public void setUp() {


        longsword = new Sword();
        axe = new Axe();
        barbarian = new Barbarian ("Conan", 100, longsword);
        troll = new Troll ("Terry", 50, axe);


    }

    @Test
    public void getName() {
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void setName() {
        barbarian.setName("Jim");
        assertEquals("Jim", barbarian.getName());
    }

    @Test
    public void getHealth() {
        assertEquals(100, barbarian.getHealth());
    }

    @Test
    public void setHealth() {
        barbarian.setHealth(50);
        assertEquals(50, barbarian.getHealth());
    }

    @Test
    public void canBackpackCount__isEmpty(){
        assertEquals(0, barbarian.backpackCount());
    }

    @Test
    public void hasWeapon() {
        assertEquals(longsword, barbarian.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        barbarian.setWeapon(axe);
        assertEquals(axe, barbarian.getWeapon());
    }

    @Test
    public void canBeAttacked() {
        troll.getWeapon().attack(barbarian);
        assertEquals(75, barbarian.getHealth());
    }

    @Test
    public void canAttack() {
        barbarian.getWeapon().attack(troll);
        assertEquals(30, troll.getHealth());
    }


}
