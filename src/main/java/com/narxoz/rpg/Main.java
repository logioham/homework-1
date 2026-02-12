package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory.*;
import com.narxoz.rpg.equipment.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Character & Equipment System ===\n");


        setupHero(
                new WarriorFactory(),
                "Арагорн",
                new MedievalEquipmentFactory()
        );


        setupHero(
                new MageFactory(),
                "Гэндальф",
                new MagicEquipmentFactory()
        );


        setupHero(
                new ArcherFactory(),
                "Леголас",
                new RangerEquipmentFactory()
        );



        System.out.println("\n=== Demo Complete ===");
    }



    private static void setupHero(CharacterFactory charFactory, String name, EquipmentFactory equipFactory) {

        Character hero = charFactory.createCharacter(name);


        Weapon weapon = equipFactory.createWeapon();
        Armor armor = equipFactory.createArmor();


        hero.displayStats();
        hero.equipWeapon(weapon);
        hero.equipArmor(armor);

        hero.useSpecialAbility();
        hero.displayEquipment();

        System.out.println("------------------------------------------\n");
    }
}