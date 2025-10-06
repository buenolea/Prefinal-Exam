/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buenoproblem2;

/**
 *
 * @author User
 */
public abstract class Character {
     String name;
     int level;
     int health;
     Weapon weapon;

    
    public String getName() {
    return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", level=" + level + ", health=" + health + ", weapon=" + weapon + '}';
    }
    //Abstract methods
    public abstract void attack();
    public abstract void defend();
    
}
