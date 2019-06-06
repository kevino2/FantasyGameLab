package enemies;

import spells.Spell;
import spells.SpellType;

public class Witch extends Enemy {

    private Spell spell;

    public Witch(String name, int health, Spell spell) {
        super(name, health);
        this.spell = spell;
    }

    public Spell getSpell() {
        return this.spell;
    }

    public void setSpell(Spell newSpell) {
        this.spell = newSpell;
    }


}
