/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buenoproblem2;

/**
 *
 * @author User
 */
public class Warrior extends Character{
    private int armor_strength;

    public Warrior(int armor_strength, String name,int level, int health, Weapon weapon) {
        this.armor_strength = armor_strength;
    }

    public int getArmor_strength() {
        return armor_strength;
    }

    public void setArmor_strength(int armor_strength) {
        this.armor_strength = armor_strength;
    }
    
    @Override
    public void attack() {
        if (getWeapon()==null) {
            System.out.println("Error: Warrior must have a weapon to attack!");
        } else {
            System.out.println(getName() + " attack with" + getWeapon().getType() + " dealing " + getWeapon().getDamage() + "damage!");
        }
    }

    @Override
    public void defend() {
        System.out.println(getName() + "defends with armor_strength of " + armor_strength + "!" );
    }

    @Override
    public String toString() {
        return "Warrior[" + "Armor Strength=" + armor_strength + "]" + super.toString();
    }
    
}
