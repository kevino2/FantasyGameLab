package playerTests;

import enemies.Witch;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import spells.Spell;
import spells.SpellType;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class WitchTest {

    private Sword longsword;
    private Barbarian barbarian;
    private Witch witch;
    private Spell firespell;
    private Spell abracadabra;

    @Before
    public void setUp() {
        firespell = new Spell(SpellType.FIREBOLT);
        abracadabra = new Spell(SpellType.ABRACADABRA);
        witch = new Witch("Milly", 120, firespell);
        longsword = new Sword();
        barbarian = new Barbarian ("Conan", 100, longsword);
    }

    @Test
    public void canGetWitchName(){
        assertEquals("Milly", witch.getName());
    }

    @Test
    public void canGetHeatlh() {
        assertEquals(120, witch.getHealth());
    }

    @Test
    public void canGetSpell() {
        assertEquals (firespell, witch.getSpell());
    }

    @Test
    public void canGetSpellDamage() {
        assertEquals (20, witch.getSpell().getSpellDamage());
    }

    @Test
    public void canChangeSpell(){
        witch.setSpell(abracadabra);
        assertEquals (abracadabra, witch.getSpell());
    }


    @Test
    public void canBeAttacked() {
        barbarian.getWeapon().attack(witch);
        assertEquals(100, witch.getHealth());
    }

    @Test
    public void canAttack() {
        witch.getSpell().spellAttack(barbarian);
        assertEquals(80, barbarian.getHealth());
    }


}
