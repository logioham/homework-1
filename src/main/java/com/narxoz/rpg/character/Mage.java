package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Mage implements Character {
    private String name;
    private int health = 80, mana = 150, strength = 20, intelligence = 90;
    private Weapon weapon;
    private Armor armor;

    public Mage(String name) { this.name = name; }

    @Override public String getName() { return name; }

    @Override public void displayStats() {
        System.out.println("=== " + name + " (Mage) ===\nHP: " + health + " | MP: " + mana + " | INT: " + intelligence);
    }

    @Override public void useSpecialAbility() {
        System.out.println(name + " кастует ARCANE BLAST! Магический урон критический!");
    }

    @Override public void equipWeapon(Weapon w) { this.weapon = w; }
    @Override public void equipArmor(Armor a) { this.armor = a; }

    @Override public void displayEquipment() {
        System.out.println("Снаряжение " + name + ":");
        if (weapon != null) weapon.displayInfo();
        if (armor != null) armor.displayInfo();
    }
}