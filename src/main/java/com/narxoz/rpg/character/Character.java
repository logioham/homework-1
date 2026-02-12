package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;

/**
 * Base interface for all character types in the RPG system.
 *
 * TODO: Decide if this should be an interface or abstract class
 * Think: What's common to ALL characters?
 * Think: What varies between character types?
 *
 * Factory Method Pattern:
 * This represents the "Product" in the Factory Method pattern.
 * Different character classes (Warrior, Mage, Archer) are concrete products.
 */


public interface Character {
    String getName();
    void displayStats();
    void useSpecialAbility();

    // Взаимодействие со снаряжением
    void equipWeapon(Weapon weapon);
    void equipArmor(Armor armor);
    void displayEquipment();
}

