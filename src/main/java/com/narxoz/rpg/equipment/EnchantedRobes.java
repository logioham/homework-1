package com.narxoz.rpg.equipment;

public class EnchantedRobes implements Armor {
    private int defense = 10;
    private int spellResist = 25;

    @Override
    public int getDefense() { return defense; }

    @Override
    public String getArmorInfo() {
        return "Enchanted Robes (Magic) - Lightweight with high spell resistance.";
    }

    @Override
    public void displayInfo() {
        System.out.println("Armor: " + getArmorInfo() + " | Defense: " + defense);
    }
}