package enemies;

import shared.IAttack;

public abstract class Enemy implements IAttack {

    private String name;
    private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int newHealth) {
        this.health = newHealth;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }
}
