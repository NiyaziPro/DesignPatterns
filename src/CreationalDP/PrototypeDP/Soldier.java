package CreationalDP.PrototypeDP;

import static CreationalDP.AbstractFactoryDP.Color.*;

public class Soldier implements Cloneable {

    private int health;
    private int maxLifeTime;
    private int power;
    private String weapon;
    private boolean isAvailable;

    public Soldier() {
    }

    public Soldier(int health, int maxLifeTime, int power, String weapon, boolean isAvailable) {
        this.health = health;
        this.maxLifeTime = maxLifeTime;
        this.power = power;
        this.weapon = weapon;
        this.isAvailable = isAvailable;
    }

    public void printInfo() {
        System.out.println("Maksimum life time : " + this.maxLifeTime);
        System.out.println("Health : " + this.health);
        System.out.println("Weapon : " + this.weapon);
        System.out.println("Power : " + this.power);

        if (isAvailable) {
            System.out.println(BLUE + "Ready........." + RESET);
        } else {
            System.out.println(RED + "Not Ready !!!" + RESET);
        }

    }

    @Override
    public Soldier clone() {
        try {
            Soldier cloneSoldier = (Soldier) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return cloneSoldier;
        } catch (CloneNotSupportedException e) {
            System.out.println(RED + "Error! Soldier could not be created!");
            e.printStackTrace();
        }
        return null;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxLifeTime() {
        return maxLifeTime;
    }

    public void setMaxLifeTime(int maxLifeTime) {
        this.maxLifeTime = maxLifeTime;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
