package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

/**
 * Example concrete implementation of a Character.
 *
 * This is provided as a reference to help you get started.
 * Study this implementation, then create similar classes for Mage, Archer, etc.
 *
 * Notice:
 * - How attributes are initialized
 * - How methods are implemented
 * - The structure you should follow for other character types
 *
 * TODO: Create similar implementations for:
 * - Mage (high mana/intelligence, low health/strength)
 * - Archer (balanced stats, ranged combat)
 * - (Optional) Additional classes: Rogue, Paladin, etc.
 */
public class Warrior implements Character {
    private String name;
    private int health = 120, mana = 30, strength = 90, intelligence = 40;
    private Weapon weapon;
    private Armor armor;

    public Warrior(String name) { this.name = name; }

    @Override public String getName() { return name; }

    @Override public void displayStats() {
        System.out.println("=== " + name + " (Archer) ===\nHP: " + health + " | MP: " + mana + " | INT: " + intelligence);
    }

    @Override public void useSpecialAbility() {
        System.out.println(name + " Использует Scream of War! Враги в области приманены!");
    }

    @Override public void equipWeapon(Weapon w) { this.weapon = w; }
    @Override public void equipArmor(Armor a) { this.armor = a; }

    @Override public void displayEquipment() {
        System.out.println("Снаряжение " + name + ":");
        if (weapon != null) weapon.displayInfo();
        if (armor != null) armor.displayInfo();
    }
}