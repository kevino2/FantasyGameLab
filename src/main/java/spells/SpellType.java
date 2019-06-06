package spells;

public enum SpellType {

    FIREBOLT (20),
    ABRACADABRA (10),
    DISINTEGRATION (50);

    private final int spellDamage;

    SpellType(int spellDamage) {
        this.spellDamage = spellDamage;
    }

    public int getSpellDamage () {
        return spellDamage;
    }

}

