package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Archer implements  Character {
    private String name;
    private int health = 80, mana = 70, strength = 50, intelligence = 67;
    private Weapon weapon;
    private Armor armor;

    public Archer(String name) { this.name = name; }

    @Override public String getName() { return name; }

    @Override public void displayStats() {
        System.out.println("=== " + name + " (Archer) ===\nHP: " + health + " | MP: " + mana + " | INT: " + intelligence);
    }

    @Override public void useSpecialAbility() {
        System.out.println(name + " Использует Multiple Shot! Множественный физический урон!");
    }

    @Override public void equipWeapon(Weapon w) { this.weapon = w; }
    @Override public void equipArmor(Armor a) { this.armor = a; }

    @Override public void displayEquipment() {
        System.out.println("Снаряжение " + name + ":");
        if (weapon != null) weapon.displayInfo();
        if (armor != null) armor.displayInfo();
    }
}
