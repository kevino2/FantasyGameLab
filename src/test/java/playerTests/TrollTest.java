package playerTests;

import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import weapons.Axe;

import static org.junit.Assert.assertEquals;

public class TrollTest {
    Axe axe;
    Troll troll;
    Barbarian barbarian;


    @Before
    public void setUp() {
        axe = new Axe();
        troll = new Troll("Terry", 50, axe);
        barbarian = new Barbarian("Conan", 100, axe);
    }

    @Test
    public void hasName() {
        assertEquals("Terry", troll.getName());
    }

    @Test
    public void canGetHealth () {
        assertEquals(50, troll.getHealth());
    }

    @Test
    public void canGetWeapon () {
        assertEquals(axe, troll.getWeapon());
    }

    @Test
    public void canSetHealth() {
        troll.setHealth(40);
        assertEquals(40, troll.getHealth());
    }

    @Test
    public void canBeAttacked() {
        barbarian.getWeapon().attack(troll);
        assertEquals(25, troll.getHealth());
    }

    @Test
    public void canAttack() {
        troll.getWeapon().attack(barbarian);
        assertEquals(75, barbarian.getHealth());
    }

}
