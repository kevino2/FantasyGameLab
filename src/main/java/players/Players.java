package players;

import treasure.ITreasure;
import treasure.Treasure;

import java.util.ArrayList;

public abstract class Players {
    private String name;
    private int health;
    private ArrayList <ITreasure> backpack;

    public Players(String name, int health) {
        this.name = name;
        this.health = health;
        this.backpack = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int backpackCount() {
        return this.backpack.size();
    }

}
