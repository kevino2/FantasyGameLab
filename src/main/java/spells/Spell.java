package spells;

import shared.IAttack;

public class Spell {

    private SpellType spellType;

    public Spell(SpellType spellType) {
        this.spellType = spellType;
    }

    public int getSpellDamage(){
        return this.spellType.getSpellDamage();
    }

    public void spellAttack(IAttack defender){
            defender.takeDamage(spellType.getSpellDamage());
    }
}
