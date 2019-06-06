package playerTests;

import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import players.weapons.IWeapon;
import players.weapons.Sword;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {


    Barbarian barbarian;

    @Before
    public void setUp() {

        IWeapon longsword = new Sword();
        barbarian = new Barbarian ("Conan", 100, longsword);

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
}
